client_id = '53ba9295a0ff461da55ad1b998f85f72'
client_secret = 'deebd79fcc7b41a49137743d650acd14'
redirect_uri = 'https://localhost/'
authorization_base_url = "https://accounts.spotify.com/authorize"
token_url = "https://accounts.spotify.com/api/token"
scope = ["user-read-email","playlist-read-collaborative"]
from requests_oauthlib import OAuth2Session
spotify = OAuth2Session(client_id, scope=scope, redirect_uri=redirect_uri)


authorization_url, state = spotify.authorization_url(authorization_base_url)
print('Please go here and authorize: ', authorization_url)

redirect_response = input('\n\nPaste the full redirect URL here: ')

from requests.auth import HTTPBasicAuth
auth = HTTPBasicAuth(client_id, client_secret)
token = spotify.fetch_token(token_url, auth=auth, authorization_response=redirect_response)
print(token)

 # Fetch a protected resource, i.e. user profile
r = spotify.get('https://api.spotify.com/v1/me')
print(r.content)
#y= spotify.get('https://open.spotify.com/artist/1dVygo6tRFXC8CSWURQJq2?si=SUzIPjOiT4Sbp6O7c4IJjA')
# print(y.content)