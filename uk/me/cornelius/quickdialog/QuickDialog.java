package uk.me.cornelius.quickdialog;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by Andy Cornelius on 10/07/2015.
 */
public class QuickDialog {

    Context mContext;

    public QuickDialog(Context context) {
        mContext = context;
    }

    public void show(int title, int message) {
        String titleAsString = mContext.getResources().getString(title);
        String messageAsString = mContext.getResources().getString(message);

        show(titleAsString, messageAsString, null);
    }

    public void show(int title, String message) {
        String titleAsString = mContext.getResources().getString(title);

        show(titleAsString, message, null);
    }

    public void show(String title, int message) {
        String messageAsString = mContext.getResources().getString(message);

        show(title, messageAsString, null);
    }

    public void show(String title, String message) {
        show(title, message, null);
    }

    public void show(int title, int message, DialogInterface.OnClickListener listener) {
        String titleAsString = mContext.getResources().getString(title);
        String messageAsString = mContext.getResources().getString(message);

        show(titleAsString, messageAsString, listener);
    }

    public void show(int title, String message, DialogInterface.OnClickListener listener) {
        String titleAsString = mContext.getResources().getString(title);

        show(titleAsString, message, listener);
    }

    public void show(String title, int message, DialogInterface.OnClickListener listener) {
        String messageAsString = mContext.getResources().getString(message);

        show(title, messageAsString, listener);
    }

    public void show(String title, String message, DialogInterface.OnClickListener listener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setMessage(message)
                .setTitle(title)
                .setPositiveButton(android.R.string.ok, listener);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void toast(String message, int length) {
        Toast.makeText(mContext, message, length).show();
    }

    public void toast(String message) {
        toast(message, Toast.LENGTH_LONG);
    }
}
