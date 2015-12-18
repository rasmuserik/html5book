cp assets/header.html index.html 
pandoc README.md >> index.html
cat assets/footer.html >> index.html
xvfb-run -a wkhtmltopdf -s A5 index.html index.pdf  
