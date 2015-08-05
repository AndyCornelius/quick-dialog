# quick-dialog
Helper class for avoiding boilerplate when using AlertDialog in Android.

## Usage

Instantiate the QuickDialog class in your Activity, passing the context into the constructor.

```
private QuickDialog mQuickDialog = new QuickDialog(this);
```

You can then display an AlertDialog with a message and a "OK" button to dismiss the dialog using the show() method.

```
mQuickDialog.show("Title", R.string.some_text);
```

This will accept a String or a string id for both the title and the message.

## Lazy Toast

You can also show lazy Toast messages with the toast() method.

```
mQuickDialog.toast("A toast message");
```

This defaults to Toast.LENGTH_LONG, unless you pass an int as the second parameter.