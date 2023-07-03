import requests
response =requests.get('https://open.spotify.com/artist/1dVygo6tRFXC8CSWURQJq2?si=StvlPhhgRWKFKqNk2hIkVw')
print(response.status_code)
print(response.text)
#print(response.content)