pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'building the application'
            }
        }
        stage('deploy') {
            when {
                expression{
                    BRANCH_NAME=='dev-moacir' || BRANCH_NAME=='main'
                }
            }    
            steps {
                echo 'deploying the application for the branches main and dev-moacir'
            }
        }
    }
}
