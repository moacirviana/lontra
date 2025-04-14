pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                script {
                    sh 'docker compose up -d'
                }
            }
        }
        stage('test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('deploy') {
            steps {
                echo 'docker compose up -d'
            }
        }
    }
}
