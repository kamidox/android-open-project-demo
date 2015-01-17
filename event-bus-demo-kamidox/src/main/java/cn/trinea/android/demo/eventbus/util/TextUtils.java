package cn.trinea.android.demo.eventbus.util;

import android.widget.EditText;
import cn.trinea.android.common.util.StringUtils;

public class TextUtils {

    private TextUtils() { /* cannot be instantiated */}

    /**
     * 
     * @param et
     * @return {@link EditText#getEditableText()} if not empty, else return {@link EditText#getHint()}
     */
    public static CharSequence getHintIfTextIsNull(EditText et) {
        if (et == null) {
            return null;
        }
        String text = et.getEditableText().toString();
        return (StringUtils.isEmpty(text)) ? et.getHint() : text;
    }
}
