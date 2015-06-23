package nyc.c4q.nyteam.nynow;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by c4q-vanice on 6/22/15.
 */

// This is a dialog that informs the user of an error or network connectivity issues.
public class AlertUserError extends android.support.v4.app.DialogFragment{
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            Context context = getActivity();
            AlertDialog.Builder builder = new AlertDialog.Builder(context) // initial a builder to build the AlertDialog.
                    .setTitle(context.getString(R.string.error_dialog_title)) // The title of the dialog box.
                    .setMessage(context.getString(R.string.error_message)) // The message in the dialog box.
                    .setPositiveButton(context.getString(R.string.error_okay_button), null);
// This is for the user to press okay after the message. Null is used, instead of OnClickListener because I do not want it to do anything.

            AlertDialog dialog = builder.create(); // This is where the builder creates the dialog box.

            return dialog;
        }
}
