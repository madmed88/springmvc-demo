'use strict';

function ContactListController($scope, $location, Contact) {
    $scope.contacts = Contact.query();
    $scope.gotoContactNewPage = function () {
        $location.path("/contact/new");
    };
    $scope.deleteContact = function (contact) {
        contact.$delete({'id':contact.id}, function () {
            $location.path('/');
        });
    };
}

function ContactDetailController($scope, $routeParams, $location, Contact) {
    $scope.contact = Contact.get({id:$routeParams.id}, function (contact) {
    });
    $scope.gotoContactListPage = function () {
        $location.path("/");
    };
}

function ContactNewController($scope, $location, Contact) {
    $scope.submit = function () {
        Contact.save($scope.contact, function (contact) {
            $location.path('/');
        });
    };
    $scope.gotoContactListPage = function () {
        $location.path("/");
    };
}