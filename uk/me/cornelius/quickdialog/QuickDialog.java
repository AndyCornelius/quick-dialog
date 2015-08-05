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

        show(titleAsString, messageAsString);
    }

    public void show(int title, String message) {
        String titleAsString = mContext.getResources().getString(title);

        show(titleAsString, message);
    }

    public void show(String title, int message) {
        String messageAsString = mContext.getResources().getString(message);

        show(title, messageAsString);
    }

    public void show(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
        builder.setMessage(title)
                .setTitle(message)
                .setPositiveButton(android.R.string.ok, null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void toast(String message, int length) {
        Toast.makeText(mContext,message,length).show();
    }

    public void toast(String message) {
        toast(message, Toast.LENGTH_LONG);
    }
}
