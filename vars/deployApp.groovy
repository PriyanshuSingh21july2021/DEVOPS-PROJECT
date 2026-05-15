
def call() {

    echo 'Deploying...'

    sh 'docker rm -f notes-container || true'

    sh 'docker run -d -p 8000:8000 --name notes-container notes-app:latest'
}

