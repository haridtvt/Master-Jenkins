def call(String SONAR_URL, String SONAR_AUTH_TOKEN, String WORKSPACE) {
    sh """
        docker run --rm \
            --network host \
            -e SONAR_HOST_URL="${SONAR_URL}" \
            -e SONAR_TOKEN="${SONAR_AUTH_TOKEN}" \
            -v "${WORKSPACE}:/usr/src" \
            sonarsource/sonar-scanner-cli \
            -Dsonar.projectKey=my-devsecops-project \
            -Dsonar.sources=.
        """
}