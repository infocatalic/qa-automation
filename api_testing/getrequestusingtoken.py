# import requests
# response = requests.get('https://api.spotify.com/v1/me', headers={'Authorization': 'access_token myToken'})
# print(response)

# import requests

# myToken = 'BQDqwZ6iXvKwRcnZnXUxIem7-djmt8jpPEJvMDXwO42YAAOrznodb-QEKU0p3oP3Eal7vctQVkIJqj3ucivP4ClXbh9--p2VEqDOKMnKaunzsSWHq4UIcVbnX63SjC9SNrCiMhVplYk66_CPohf2YGDDCs0ZALk5LB6PClftY6wFV76i4RWRLKupjNEM1vsr9fZdjTeR76mYEg'
# myUrl = 'https://api.spotify.com'
# head = {'Authorization': 'token {}'.format(myToken)}
# response = requests.get(myUrl, headers=head)
# print(response)


import requests
import json

myToken = 'BQDqwZ6iXvKwRcnZnXUxIem7-djmt8jpPEJvMDXwO42YAAOrznodb-QEKU0p3oP3Eal7vctQVkIJqj3ucivP4ClXbh9--p2VEqDOKMnKaunzsSWHq4UIcVbnX63SjC9SNrCiMhVplYk66_CPohf2YGDDCs0ZALk5LB6PClftY6wFV76i4RWRLKupjNEM1vsr9fZdjTeR76mYEg'
myUrl = 'https://open.spotify.com/artist/1dVygo6tRFXC8CSWURQJq2?si=bzKxAAOeQhWmn7myPga05Q'
head = {'Authorization': 'token {}'.format(myToken)}
response = requests.get(myUrl, headers=head)

print(response)
print(response.content)
#print(response.json())
