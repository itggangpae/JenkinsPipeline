pipeline{
    agent any
    stages{
        stage("permission"){
            steps{
                 sh "chmod +x ./gradlew"
            }
        }
        stage("compile"){
            steps{
                 sh "./gradlew compileJava"
            }
        }
        stage("test"){
            steps{
                 sh "./gradlew test"
            }
        }
        stage("test coverage"){
            steps{
                 sh "./gradlew test jacocoTestCoverageVerification"
                 sh "./gradlew test jacocoTestReport"
            }
        }
        stage("Gradle Build"){
            steps{
               sh "./gradlew clean build"
            }
        }

        stage("Docker Build"){
            steps{
                sh "docker build -t jenkinspipeline ."
           }
        }
    }
}