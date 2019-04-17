#!/bin/bash

# add the section below to your .bashrc to run manually your app in Play
# or execute this script with ". configure.sh" shell command (and NOT "./configure.sh").
# before launching Play console.

export PPRB_DB_URL="jdbc:mysql://localhost/myweb"
export PPRB_DB_USER="myweb_db_user"
export PPRB_DB_PWD="password"

# list of allowed origin is not currenty supported
set PPRB_CORS_ACCESS_CONTROL_ALLOW_ORIGIN="http://localhost:9000"

set PPRB_TECH_EMAIL="junk@marc-loupias.fr"
set PPRB_NOREPLY_EMAIL="noreply@poc-play-rest-backed.org";
set PPRB_MAILER_SMTP_URL="uselessInDevMode";
set PPRB_MAILER_SMTP_USERNAME="uselessInDevMode";
set PPRB_MAILER_SMTP_PWD="uselessInDevMode";
