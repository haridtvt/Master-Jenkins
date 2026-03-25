def call(String S3_URL) {
    sh 'aws s3 cp *.html ${S3_URL}'
    sh 'rm -rf *.html'
}