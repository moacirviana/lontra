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
                    BRANCH_NAME=='dev-moacir'
                }
            }    
            steps {
                echo 'deploying the application'
            }
        }
    }
}
