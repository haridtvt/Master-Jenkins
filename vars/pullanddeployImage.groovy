def call (String API_IMAGE, String WORKER_IMAGE, String WEB_IMAGE) {
    sh 'docker pull ${API_IMAGE}'
    sh 'docker pull ${WORKER_IMAGE}'
    sh 'docker pull ${WEB_IMAGE}'
    sh 'docker-compose down -v || true'
    sh 'docker-compose up -d'
}