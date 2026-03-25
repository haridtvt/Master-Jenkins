def call(String DOCKER_PASS, String DOCKER_UNAME) {
    sh "echo ${DOCKER_PASS} | docker login -u $DOCKER_UNAME --password-stdin"
}