import org.proenza.Utils;

def call(Boolean deployToProduction, Boolean isTypescript) {
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
                    sh """
                        echo Deployment enviroment: ${utils.getEnviroment(deployToProduction)}
                    """
                    script {
                        utils.getBuildScript(isTypescript)
                    }
                }
            }
        }
    }
}