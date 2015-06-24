/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
var app = {
    // Application Constructor
    initialize: function() {
        this.bindEvents();
    },
    // Bind Event Listeners
    //
    // Bind any events that are required on startup. Common events are:
    // 'load', 'deviceready', 'offline', and 'online'.
    bindEvents: function() {
        document.addEventListener('deviceready', this.onDeviceReady, false);
    },
    // deviceready Event Handler
    //
    // The scope of 'this' is the event. In order to call the 'receivedEvent'
    // function, we must explicitly call 'app.receivedEvent(...);'
    onDeviceReady: function() {
        app.receivedEvent('deviceready');

    },
    // Update DOM on a Received Event
    receivedEvent: function(id) {
        var parentElement = document.getElementById(id);
        var listeningElement = parentElement.querySelector('.listening');
        var receivedElement = parentElement.querySelector('.received');

        listeningElement.setAttribute('style', 'display:none;');
        receivedElement.setAttribute('style', 'display:block;');

        console.log('Received Event: ' + id);
    }
};

app.initialize();

$('button').on('click', function(e){
    var id = e.target.id;
    var $target = $(e.target);
    var success = function(message) {
        console.log(message);
    };

    var failure = function(message) {
        console.log(message);
        console.log("Error calling Hello Plugin");
    };

    switch( id ){
        case "con":
            ftpclient.connect(success, failure, "112.169.59.106", "naniku", "naniku", true);
            break;
        case "put":
            ftpclient.asyncPutFile(success, failure, "../storage/emulated/0/DCIM/Camera/20150617_141616.mp4", "test.mp4");
            break;
        case "size":
            ftpclient.getRemoteFileSize(success, failure, "test.mp4");
            break;
        case "change":
            ftpclient.changeRemoteDir(success, failure, "dan");
            break;
        case "create":
            ftpclient.createRemoteDir(success, failure, "niku");
            break;
        case "del":
            ftpclient.deleteRemoteFile(success, failure, "config.xml");
            break;
    }

});