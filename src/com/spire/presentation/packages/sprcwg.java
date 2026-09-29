/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprraz;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvdm;
import com.spire.presentation.packages.sprwr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprcwg {
    private static final byte[] cfr_renamed_4 = sprfqe.cfr_renamed_488(sprraz.cfr_renamed_9("[\u0013YgYdYgX\u001bYfYdX\u0017X\u0011]\u0012Z\u0011Y\u0017YgY\u0016Y\u0017X\u0010]\u0012]\u0012]\u0012]\u0012"));

    private /* synthetic */ sprcwg() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_7873(sprifm arg0) {
        sprvdm sprvdm2 = (sprvdm)arg0.cfr_renamed_1521();
        switch (sprvdm2.cfr_renamed_579()) {
            case 8: {
                return sprqve.cfr_renamed_9("g\u0014a\u0013j K#J\u0004j\u0016\u0010b\u0014\u0014i\u0013d");
            }
            case 9: {
                return sprraz.cfr_renamed_9("g,a+j\u0018K\u001bJ<j.\u0011W\u0016,i+d");
            }
            case 10: {
                return sprqve.cfr_renamed_9("g\u0014a\u0013j K#J\u0004j\u0016\u0017f\u0010\u0014i\u0013d");
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprraz.cfr_renamed_9(":L\u0004L\u0000U\u0001\u0002\u0007C\u001cJOC\u0003E\u0000P\u0006V\u0007OOQ\u001fG\fK\tK\nFU\u0002")).append(sprvdm2.cfr_renamed_579()).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_7874(sprifm arg0) {
        sprvdm sprvdm2 = (sprvdm)arg0.cfr_renamed_1521();
        switch (sprvdm2.cfr_renamed_579()) {
            case 8: {
                return sprqve.cfr_renamed_9("\u000f\u0010b\u0017f\u001b K#J\u0004j\u0016\u0010b\u0014\u0014i\u0013d");
            }
            case 9: {
                return sprraz.cfr_renamed_9("7\u0010Z\u0017^\u001b\u0018K\u001bJ<j.\u0011W\u0016,i+d");
            }
            case 10: {
                return sprqve.cfr_renamed_9("\u000f\u0010b\u0017f\u001b K#J\u0004j\u0016\u0017f\u0010\u0014i\u0013d");
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprraz.cfr_renamed_9(":L\u0004L\u0000U\u0001\u0002\u0007C\u001cJOC\u0003E\u0000P\u0006V\u0007OOQ\u001fG\fK\tK\nFU\u0002")).append(sprvdm2.cfr_renamed_579()).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprlem cfr_renamed_7875(int arg0) throws sprtqg {
        switch (arg0) {
            case 7: {
                return sprwr.cfr_renamed_136;
            }
            case 8: {
                return sprwr.cfr_renamed_287;
            }
            case 9: {
                return sprwr.cfr_renamed_3;
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprqve.cfr_renamed_9("\"L<L8U9\u0002$[:O2V%K4\u00026N0M%K#J:\u0002\u001efm\u0002")).append(arg0).toString());
    }

    public static byte[] cfr_renamed_7876(sprifm arg0, sprrk arg1) throws IOException, sprtqg {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprvdm sprvdm2 = (sprvdm)arg0.cfr_renamed_1521();
        byte[] byArray = sprvdm2.cfr_renamed_7813().cfr_renamed_91();
        byteArrayOutputStream.write(byArray, 1, byArray.length - 1);
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byteArrayOutputStream.write(arg0.cfr_renamed_593());
        byteArrayOutputStream4.write(3);
        byteArrayOutputStream4.write(1);
        byteArrayOutputStream3.write(sprvdm2.cfr_renamed_579());
        byteArrayOutputStream3.write(sprvdm2.cfr_renamed_7877());
        byteArrayOutputStream2.write(cfr_renamed_4);
        byteArrayOutputStream2.write(arg1.cfr_renamed_7812(arg0));
        return byteArrayOutputStream2.toByteArray();
    }
}

