
def call() {

    pipeline {

        agent any

        stages {

            stage('Clone Code') {
                steps {
                    cloneCode()
                }
            }

            stage('Build') {
                steps {
                    buildDocker()
                }
            }

            stage('Test') {
                steps {
                    testApp()
                }
            }

            stage('Push') {
                steps {
                    pushDocker()
                }
            }

            stage('Deploy') {
                steps {
                    deployApp()
                }
            }
        }

        post {

            success {
                echo 'Pipeline Successful 🚀'
            }

            failure {
                echo 'Pipeline Failed ❌'
            }
        }
    }
}

