import org.proenza.Utils;

def call() {
    def utils = new Utils();

    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    script {
                        utils.info('Building app...')
                    }
                }
            }
            stage('Test') {
                steps {
                    script {
                        utils.info('Testing app...')
                    }
                }
            }
            stage('Deploy') {
                steps {
                    script {
                        utils.info('Deploying app...')
                    }
                }
            }
        }
    }
}