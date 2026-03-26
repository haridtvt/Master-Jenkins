def call(String S3_URL) {
    sh """
        aws s3 cp . ${S3_URL} \
            --recursive \
            --exclude "*" \
            --include "*.html"
        rm -rf *.html
    """
}