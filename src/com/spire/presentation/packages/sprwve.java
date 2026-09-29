/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkzn;
import com.spire.presentation.packages.sprosda;
import com.spire.presentation.packages.sprxi;
import java.util.ArrayList;
import java.util.Collection;

public class sprwve
implements sprxi {
    private Collection cfr_renamed_4;

    public Collection cfr_renamed_172() {
        return new ArrayList(this.cfr_renamed_4);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = stringBuffer.append(sprkzn.cfr_renamed_9("\u00148|4\u000fb a)n8d#c\u001fy#\u007f)]-\u007f-`)y)\u007f?7lVF"));
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(sprosda.cfr_renamed_9("+\u001chSgPn_\u007fUdR1\u001c") + this.cfr_renamed_4 + "\n");
        stringBuffer3.append("]");
        return stringBuffer3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprwve(Collection collection) {
        void arg0;
        if (collection == null) {
            throw new NullPointerException(sprkzn.cfr_renamed_9("/b a)n8d#cln-c\"b8-.hlc9a "));
        }
        this.cfr_renamed_4 = arg0;
    }

    public Object clone() {
        return new sprwve(this.cfr_renamed_4);
    }
}

