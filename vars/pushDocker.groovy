
def call() {

    echo 'Pushing to DockerHub...'

    withCredentials([usernamePassword(
        credentialsId: 'dockerhub-creds',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {

        sh """
        echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin
        docker tag notes-app:latest priyanshu364/notes-app:latest
        docker push priyanshu364/notes-app:latest
        """
    }
}

