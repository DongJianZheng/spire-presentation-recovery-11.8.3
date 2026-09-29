/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrg;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprkqo;
import com.spire.presentation.packages.sprlsg;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmky;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnwg;
import com.spire.presentation.packages.sprqrg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprryg;
import com.spire.presentation.packages.sprtbh;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchProviderException;
import java.util.Iterator;

public class sprazg {
    public static sprvbh cfr_renamed_8061(InputStream arg0) throws IOException, sprtqg {
        Iterator<sprtbh> iterator = new sprryg(sprmxg.cfr_renamed_7556(arg0), (sprrk)new sprmwg()).cfr_renamed_7704();
        while (iterator.hasNext()) {
            Iterator<sprvbh> iterator2 = iterator.next().cfr_renamed_7458();
            while (iterator2.hasNext()) {
                sprvbh sprvbh2 = iterator2.next();
                if (!sprvbh2.cfr_renamed_7760()) continue;
                return sprvbh2;
            }
        }
        throw new IllegalArgumentException(sprmky.cfr_renamed_9("x\u0019U_OX]\u0011U\u001c\u001b\u001dU\u001bI\u0001K\fR\u0017UXP\u001dBXR\u0016\u001b\u0013^\u0001\u001b\nR\u0016\\V"));
    }

    public static sprvbh cfr_renamed_8062(String arg0) throws IOException, sprtqg {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        sprvbh sprvbh2 = sprazg.cfr_renamed_8061(bufferedInputStream);
        ((InputStream)bufferedInputStream).close();
        return sprvbh2;
    }

    public static spriyg cfr_renamed_8058(InputStream arg0) throws IOException, sprtqg {
        Iterator<sprbrg> iterator = new sprlsg(sprmxg.cfr_renamed_7556(arg0), (sprrk)new sprmwg()).cfr_renamed_7704();
        while (iterator.hasNext()) {
            Iterator<spriyg> iterator2 = iterator.next().cfr_renamed_7716();
            while (iterator2.hasNext()) {
                spriyg spriyg2 = iterator2.next();
                if (!spriyg2.cfr_renamed_7739()) continue;
                return spriyg2;
            }
        }
        throw new IllegalArgumentException(sprkqo.cfr_renamed_9("I'da~fl/d\"*5c!d/d!*-o?*/dfa#sfx/d!$"));
    }

    public static sprmah cfr_renamed_8063(sprlsg arg0, long arg1, char[] arg2) throws sprtqg, NoSuchProviderException {
        spriyg spriyg2 = arg0.cfr_renamed_7708(arg1);
        if (spriyg2 == null) {
            return null;
        }
        return spriyg2.cfr_renamed_7744(new sprqrg().cfr_renamed_1499("BC").cfr_renamed_1480(arg2));
    }

    public static byte[] cfr_renamed_8064(String arg0, int arg1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprnwg sprnwg2 = new sprnwg(arg1);
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        sprmxg.cfr_renamed_7551(sprnwg2.cfr_renamed_4137(byteArrayOutputStream2), 'b', new File(arg0));
        sprnwg2.cfr_renamed_2637();
        return byteArrayOutputStream2.toByteArray();
    }

    public static spriyg cfr_renamed_8065(String arg0) throws IOException, sprtqg {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        spriyg spriyg2 = sprazg.cfr_renamed_8058(bufferedInputStream);
        ((InputStream)bufferedInputStream).close();
        return spriyg2;
    }
}

