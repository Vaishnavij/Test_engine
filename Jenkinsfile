node('node') {
    // some block
    pwd()
    stage('checkout') {
    // some block
    git 'https://github.com/saigopi/Test_engine-1'
    }
    stage ('gradle') {
    // some block
    tool name: 'gradle', type: 'gradle'
    }
    stage ( 'shrun') {
        echo "This time, the Gradle version"
        sh '~/gradle-4.1/bin/gradle test2'
        echo "Ramesh:Gopinath Updatenew"
      }
}
