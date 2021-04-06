import org.proenza.Utils;

def utils = new Utils();

def call() {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    utils.info('Building app...')
                }
            }
            stage('Test') {
                steps {
                    utils.info('Testing app...')
                }
            }
            stage('Deploy') {
                steps {
                    utils.info('Deploying app...')
                }
            }
        }
    }
}