import org.proenza.Utils;

def utils = new Utils();

def call() {
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