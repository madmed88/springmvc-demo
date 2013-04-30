'use strict';

angular.module('contactApp', ['contactService']).
        config(['$routeProvider', function ($routeProvider) {
    $routeProvider.
            when('/contact/list', {templateUrl:'views/contact-list.html', controller:ContactListController}).
            when('/contact/new', {templateUrl:'views/contact-new.html', controller:ContactNewController}).
            when('/contact/:id', {templateUrl:'views/contact-detail.html', controller:ContactDetailController}).
            otherwise({redirectTo:'/contact/list'});
}]);