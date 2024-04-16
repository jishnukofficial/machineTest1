from flask import Flask, jsonify, request

app = Flask(__name__)

# Dummy user database
users = {
    "user1": {"username": "user1", "password": "password1"},
    "user2": {"username": "user2", "password": "password2"}
}

# Endpoint for user authentication
@app.route('/login', methods=['POST'])
def login():
    data = request.get_json()
    username = data['username']
    password = data['password']
    if username in users and users[username]['password'] == password:
        return jsonify({"message": "Login successful"}), 200
    else:
        return jsonify({"message": "Invalid credentials"}), 401

# Endpoint for retrieving latitude and longitude
@app.route('/coordinates', methods=['GET'])
def get_coordinates():
    # Dummy coordinates
    coordinates = {"from": {"lat": 40.7128, "lng": -74.0060}, "to": {"lat": 34.0522, "lng": -118.2437}}
    return jsonify(coordinates), 200

if __name__ == '__main__':
    app.run(debug=True)
