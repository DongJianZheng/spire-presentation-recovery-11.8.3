/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spren;
import com.spire.presentation.packages.sprfaf;
import com.spire.presentation.packages.sprhef;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlhf;
import com.spire.presentation.packages.sprnhn;
import com.spire.presentation.packages.sprpye;
import com.spire.presentation.packages.sprqgf;
import com.spire.presentation.packages.sprxwe;
import com.spire.presentation.packages.sprycq;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class sprohf {
    private static final Comparator<byte[]> cfr_renamed_4 = new sprhef();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5316(sprjj arg0, InputStream arg1) {
        try {
            OutputStream outputStream;
            sprjj sprjj2 = arg0;
            OutputStream outputStream2 = outputStream = sprjj2.cfr_renamed_470();
            sprkqe.cfr_renamed_472(arg1, outputStream2);
            outputStream2.close();
            return sprjj2.cfr_renamed_580();
        }
        catch (IOException iOException) {
            throw sprxwe.cfr_renamed_5315(new StringBuilder().insert(0, sprnhn.cfr_renamed_9("NsZ\u007fWx\u001biT=X|W~NqZi^=S|Hu\u0001=")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static byte[] cfr_renamed_5317(sprjj arg0, sprqgf arg1) {
        byte[][] byArray = arg1.cfr_renamed_205();
        if (byArray.length > 1) {
            return sprohf.cfr_renamed_5318(arg0, sprohf.cfr_renamed_5319(byArray).iterator());
        }
        return byArray[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5320(sprjj arg0, byte[] arg1, byte[] arg2) {
        try {
            OutputStream outputStream;
            sprjj sprjj2 = arg0;
            OutputStream outputStream2 = outputStream = sprjj2.cfr_renamed_470();
            outputStream2.write(arg1);
            outputStream2.write(arg2);
            outputStream2.close();
            return sprjj2.cfr_renamed_580();
        }
        catch (IOException iOException) {
            throw sprxwe.cfr_renamed_5315(new StringBuilder().insert(0, sprycq.cfr_renamed_9("Z9N5C2\u000f#@wL6C4Z;N#JwG6\\?\u0015w")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static List<sprpye> cfr_renamed_5321(sprjj arg0, List<spren> arg1, byte[] arg2) {
        int n;
        sprfaf sprfaf2 = new sprfaf();
        int n2 = n = 0;
        while (n2 != arg1.size()) {
            byte[] byArray = arg1.get(n).cfr_renamed_3221(arg0, arg2);
            sprfaf2.cfr_renamed_5313(new sprpye(n++, byArray));
            n2 = n;
        }
        return sprfaf2.cfr_renamed_5312();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5322(sprjj arg0, byte[] arg1) {
        try {
            sprjj sprjj2 = arg0;
            OutputStream outputStream = sprjj2.cfr_renamed_470();
            outputStream.write(arg1);
            outputStream.close();
            return sprjj2.cfr_renamed_580();
        }
        catch (IOException iOException) {
            throw sprxwe.cfr_renamed_5315(new StringBuilder().insert(0, sprnhn.cfr_renamed_9("NsZ\u007fWx\u001biT=X|W~NqZi^=S|Hu\u0001=")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5323(sprjj arg0, byte[] arg1, byte[] arg2) {
        if (arg1 == null) {
            return arg2;
        }
        try {
            OutputStream outputStream;
            sprjj sprjj2 = arg0;
            OutputStream outputStream2 = outputStream = sprjj2.cfr_renamed_470();
            outputStream2.write(arg2);
            outputStream2.write(arg1);
            outputStream2.close();
            return sprjj2.cfr_renamed_580();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprycq.cfr_renamed_9("\"A6M;Jw[8\u000f?N$GwK6[6"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5318(sprjj arg0, Iterator<byte[]> arg1) {
        try {
            OutputStream outputStream = arg0.cfr_renamed_470();
            Iterator<byte[]> iterator = arg1;
            while (true) {
                if (!iterator.hasNext()) {
                    outputStream.close();
                    return arg0.cfr_renamed_580();
                }
                outputStream.write(arg1.next());
                iterator = arg1;
            }
        }
        catch (IOException iOException) {
            throw sprxwe.cfr_renamed_5315(new StringBuilder().insert(0, sprnhn.cfr_renamed_9("NsZ\u007fWx\u001biT=X|W~NqZi^=S|Hu\u0001=")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static List<byte[]> cfr_renamed_5319(byte[][] arg0) {
        int n;
        sprlhf sprlhf2 = new sprlhf();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            sprlhf2.cfr_renamed_5314(arg0[n++]);
            n2 = n;
        }
        return sprlhf2.cfr_renamed_5312();
    }

    public static byte[] cfr_renamed_5324(sprjj arg0, byte[] arg1, byte[] arg2) {
        if (cfr_renamed_4.compare(arg1, arg2) <= 0) {
            return sprohf.cfr_renamed_5320(arg0, arg1, arg2);
        }
        return sprohf.cfr_renamed_5320(arg0, arg2, arg1);
    }

    public static List<byte[]> cfr_renamed_5325(sprjj arg0, List<spren> arg1, byte[] arg2) {
        int n;
        sprlhf sprlhf2 = new sprlhf();
        int n2 = n = 0;
        while (n2 != arg1.size()) {
            sprlhf2.cfr_renamed_5314(arg1.get(++n).cfr_renamed_3221(arg0, arg2));
            n2 = n;
        }
        return sprlhf2.cfr_renamed_5312();
    }

    private /* synthetic */ sprohf() {
    }

    public static byte[] cfr_renamed_5326(sprjj arg0, byte[][] arg1) {
        if (arg1.length == 2) {
            return sprohf.cfr_renamed_5324(arg0, arg1[0], arg1[1]);
        }
        return sprohf.cfr_renamed_5318(arg0, sprohf.cfr_renamed_5319(arg1).iterator());
    }
}

