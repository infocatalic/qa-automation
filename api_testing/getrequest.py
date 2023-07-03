import requests
response = requests.get('https://www.spotify.com/')
print(response.status_code)
#print(response.content)
#print(response.json())


