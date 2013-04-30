'use strict';

angular.module('contactService', ['ngResource']).
        factory('Contact', function ($resource) {
            return $resource('rest/contact/:id', {}, {
                'save': {method:'POST'}
            });
        });