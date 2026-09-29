/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawg;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprfgg;
import com.spire.presentation.packages.sprfjn;
import com.spire.presentation.packages.sprhhb;
import com.spire.presentation.packages.sprirg;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprukg;
import com.spire.presentation.packages.spryul;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

public class sprgfg {
    private spryul cfr_renamed_3;
    private sprukg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfgg cfr_renamed_7516(File file, File file2) throws IOException, CertificateException {
        void arg1;
        void arg0;
        sprgfg sprgfg2 = this;
        sprgfg2.cfr_renamed_7517((File)arg0);
        sprgfg2.cfr_renamed_7517(file2);
        FileInputStream fileInputStream = new FileInputStream((File)arg0);
        FileInputStream fileInputStream2 = new FileInputStream((File)arg1);
        sprfgg sprfgg2 = sprgfg2.cfr_renamed_7518(fileInputStream, fileInputStream2);
        fileInputStream.close();
        fileInputStream2.close();
        return sprfgg2;
    }

    public sprgfg cfr_renamed_1498(Provider arg0) {
        sprgfg sprgfg2 = this;
        sprgfg2.cfr_renamed_4 = sprgfg2.cfr_renamed_4.cfr_renamed_1498(arg0);
        sprgfg2.cfr_renamed_3 = sprgfg2.cfr_renamed_3.cfr_renamed_1498(arg0);
        return sprgfg2;
    }

    public sprfgg cfr_renamed_7518(InputStream arg0, InputStream arg1) throws IOException, CertificateException {
        Object object;
        PrivateKey privateKey;
        Object object2;
        Object object3 = new sprawg(new InputStreamReader(arg0)).cfr_renamed_24();
        if (object3 instanceof sprirg) {
            object2 = (sprirg)object3;
            privateKey = this.cfr_renamed_4.cfr_renamed_5729(((sprirg)object2).cfr_renamed_1598());
        } else if (object3 instanceof sprcom) {
            privateKey = this.cfr_renamed_4.cfr_renamed_5729((sprcom)object3);
        } else {
            throw new IOException(sprhhb.cfr_renamed_9("CvD}UwQv_kS|\u0016hDq@yB}\u0016sSa\u0016~_tS"));
        }
        object2 = new sprawg(new InputStreamReader(arg1));
        ArrayList<X509Certificate> arrayList = new ArrayList<X509Certificate>();
        Object object4 = object2;
        while ((object = ((sprawg)object4).cfr_renamed_24()) != null) {
            arrayList.add(this.cfr_renamed_3.cfr_renamed_7519((sprtpl)object));
            object4 = object2;
        }
        ArrayList<X509Certificate> arrayList2 = arrayList;
        return new sprfgg(privateKey, arrayList2.toArray(new X509Certificate[arrayList2.size()]));
    }

    public sprgfg() {
        sprgfg sprgfg2 = this;
        this.cfr_renamed_4 = new sprukg();
        sprgfg2.cfr_renamed_3 = new spryul();
    }

    private /* synthetic */ void cfr_renamed_7517(File arg0) throws IOException {
        if (!arg0.canRead()) {
            if (arg0.exists()) {
                throw new IOException(new StringBuilder().insert(0, sprfjn.cfr_renamed_9("$(\u0010$\u001d#Q2\u001ef\u001e6\u0014(Q \u0018*\u0014f")).append(arg0.getPath()).append(sprhhb.cfr_renamed_9("\u0016~Yj\u0016jSyRqX\u007f\u0018")).toString());
            }
            throw new FileNotFoundException(new StringBuilder().insert(0, sprfjn.cfr_renamed_9("\u0013\u001f'\u0013*\u0014f\u0005)Q)\u0001#\u001ff")).append(arg0.getPath()).append(sprhhb.cfr_renamed_9("\"\u0016qB8RwSk\u0016vYl\u0016}NqEl\u0018")).toString());
        }
    }

    public sprgfg cfr_renamed_1499(String arg0) {
        sprgfg sprgfg2 = this;
        sprgfg2.cfr_renamed_4 = sprgfg2.cfr_renamed_4.cfr_renamed_1499(arg0);
        sprgfg2.cfr_renamed_3 = sprgfg2.cfr_renamed_3.cfr_renamed_1499(arg0);
        return sprgfg2;
    }
}

