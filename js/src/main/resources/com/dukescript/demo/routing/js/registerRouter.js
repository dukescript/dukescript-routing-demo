window['ko']['bindingHandlers']['route'] = {
    'init': function (element, valueAccessor, allBindingsAccessor, viewModel) {
        var callback = valueAccessor();
        window['onhashchange'] = function () {
            var url = location.hash.slice(2);
            callback(url);
        };
    }
};