FROM ubuntu

RUN apt-get update
RUN apt-get upgrade

#Cuando se instala php pide que se elija la situación geográfica. Con esto se arregla el problema.
ENV DEBIAN_FRONTEND noninteractive
ENV DEBCONF_NONINTERACTIVE_SEEN true

RUN apt-get -y install php
RUN apt-get install apache2

WORKDIR /var/www/html

RUN echo '<?php echo phpinfo(); ?>' > index.php

EXPOSE 80

CMD /usr/sbin/apache2ctl -D FOREGROUND