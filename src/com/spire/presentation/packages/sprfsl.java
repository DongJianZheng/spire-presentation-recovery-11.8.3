/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtl;
import com.spire.presentation.packages.sprgr;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprjx;
import com.spire.presentation.packages.sprmcm;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprtrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;

public class sprfsl
implements sprjx {
    private List cfr_renamed_2;
    private boolean cfr_renamed_3;
    private static final String cfr_renamed_4 = "53";

    public sprfsl cfr_renamed_10938(boolean arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public static /* synthetic */ void cfr_renamed_10939(sprfsl arg0, List arg1, String arg2, Attribute arg3) throws NamingException, sprixl {
        arg0.cfr_renamed_10940(arg1, arg2, arg3);
    }

    public sprfsl() {
        sprfsl sprfsl2 = this;
        sprfsl2.cfr_renamed_2 = new ArrayList();
    }

    @Override
    public sprgr cfr_renamed_10941(String arg0) {
        Hashtable<String, String> hashtable;
        Hashtable<String, String> hashtable2 = hashtable = new Hashtable<String, String>();
        hashtable2.put(sprmcm.cfr_renamed_9("RwNw\u0016xY{Qx_8^w[bWdA8QxQbQwT"), sprokp.cfr_renamed_9("w2ysg(zs~3p4:9z.:\u0019z.W2z)q%`\u001bu>`2f$"));
        hashtable2.put(sprmcm.cfr_renamed_9("RwNw\u0016xY{Qx_8YcL~WdQbYbQ`]"), this.cfr_renamed_3 ? "true" : "false");
        if (this.cfr_renamed_2.size() > 0) {
            Iterator iterator;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator iterator2 = iterator = this.cfr_renamed_2.iterator();
            while (iterator2.hasNext()) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(" ");
                }
                stringBuffer.append(new StringBuilder().insert(0, sprokp.cfr_renamed_9("p3gg;r")).append(iterator.next()).toString());
                iterator2 = iterator;
            }
            hashtable.put(sprmcm.cfr_renamed_9("|Y`Y8VwU\u007fVq\u0016fJyN\u007f\\sJ8MdT"), stringBuffer.toString());
        }
        return new sprtrl(this, hashtable, arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_10940(List arg0, String arg1, Attribute arg2) throws NamingException, sprixl {
        int n;
        int n2 = n = 0;
        while (n2 != arg2.size()) {
            byte[] byArray = (byte[])arg2.get(n);
            if (sprbtl.cfr_renamed_10942(byArray)) {
                try {
                    arg0.add(new sprbtl(arg1, byArray));
                }
                catch (IOException iOException) {
                    throw new sprixl(new StringBuilder().insert(0, sprokp.cfr_renamed_9("\u0018l>q-`4{34-u/g4z:48z)f$.}")).append(iOException.getMessage()).toString(), iOException);
                }
            }
            n2 = ++n;
        }
        return;
    }

    public sprfsl cfr_renamed_10943(String arg0) {
        sprfsl sprfsl2 = this;
        sprfsl2.cfr_renamed_2.add(arg0);
        return sprfsl2;
    }
}

