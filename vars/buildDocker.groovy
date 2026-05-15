
def call() {

    echo 'Building...'

    sh 'docker build -t notes-app:latest .'
}

