/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdtaa;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprvnj;
import com.spire.presentation.packages.sprws;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.util.Hashtable;

public abstract class sprehk {
    private static final Hashtable cfr_renamed_4 = new Hashtable();

    static {
        cfr_renamed_4.put(sprws.cfr_renamed_31, sprvnj.cfr_renamed_9("\u007f@m9[aX`~[m"));
        cfr_renamed_4.put(sprws.cfr_renamed_93, sprdtaa.cfr_renamed_9("u9gC\u0013GQ\u0018R\u0019t\"g"));
        cfr_renamed_4.put(sprws.cfr_renamed_119, sprvnj.cfr_renamed_9("[dI\u001d\u007fE|DZ\u007fIMfHEkN\u001d"));
        cfr_renamed_4.put(sprws.cfr_renamed_132, sprdtaa.cfr_renamed_9("\"n0\u0014D\u0010\u0006O\u0005N#u0G\u001fB<a7\u0017"));
        cfr_renamed_4.put(sprws.cfr_renamed_102, sprvnj.cfr_renamed_9("\u007f@m=\u001d:[aX`~[m"));
        cfr_renamed_4.put(sprws.cfr_renamed_145, sprdtaa.cfr_renamed_9("\"n0\u0013@\u0014\u0006O\u0005N#u0G\u001fB<a7\u0017"));
        cfr_renamed_4.put(sprws.cfr_renamed_152, sprvnj.cfr_renamed_9("\u007f@m9[aX`iKh[m"));
        cfr_renamed_4.put(sprws.cfr_renamed_4, sprdtaa.cfr_renamed_9("u9gC\u0014EQ\u0018R\u0019c2b\"g"));
        cfr_renamed_4.put(sprws.cfr_renamed_105, "SHA256withECDSA");
        cfr_renamed_4.put(sprws.cfr_renamed_2, "SHA384withECDSA");
        cfr_renamed_4.put(sprws.cfr_renamed_0, sprvnj.cfr_renamed_9("\u007f@m=\u001d:[aX`iKh[m"));
    }

    public Signature cfr_renamed_8039(sprlem arg0) throws NoSuchProviderException, NoSuchAlgorithmException {
        return this.cfr_renamed_1539((String)cfr_renamed_4.get(arg0));
    }

    public abstract Signature cfr_renamed_1539(String var1) throws NoSuchProviderException, NoSuchAlgorithmException;
}

