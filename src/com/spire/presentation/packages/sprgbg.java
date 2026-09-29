/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqag;
import com.spire.presentation.packages.sprsxf;
import com.spire.presentation.packages.sprsyf;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class sprgbg {
    public int[] cfr_renamed_137;
    public int[] cfr_renamed_79;
    public sprsxf cfr_renamed_107;
    public int[] cfr_renamed_132;
    public sprsxf cfr_renamed_102;
    public sprsxf cfr_renamed_93;
    public int[] cfr_renamed_86;
    public sprsxf cfr_renamed_152;
    public sprsxf cfr_renamed_112;
    public sprsxf cfr_renamed_119;
    public sprsxf cfr_renamed_91;
    public int[] cfr_renamed_0;
    public int[] cfr_renamed_1;
    public int[] cfr_renamed_2;
    public sprsxf cfr_renamed_3;
    public int[] cfr_renamed_4;

    private /* synthetic */ sprsyf cfr_renamed_6323(sprsxf arg0, int arg1) {
        sprsyf sprsyf2;
        sprsyf sprsyf3 = sprsyf2 = new sprsyf(arg0);
        sprsyf3.cfr_renamed_6324(arg1 * sprsyf3.cfr_renamed_2773());
        return sprsyf3;
    }

    private static /* synthetic */ byte[] cfr_renamed_6325(String arg0) {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 != arg0.length()) {
            if (arg0.charAt(n) != ',') {
                byteArrayOutputStream.write(arg0.charAt(n));
            }
            n2 = ++n;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public sprsyf cfr_renamed_6269(sprqag arg0, int arg1) {
        if (arg0.cfr_renamed_145 == 128) {
            sprgbg sprgbg2 = this;
            return sprgbg2.cfr_renamed_6323(sprgbg2.cfr_renamed_107, arg1);
        }
        if (arg0.cfr_renamed_145 == 129) {
            sprgbg sprgbg3 = this;
            return sprgbg3.cfr_renamed_6323(sprgbg3.cfr_renamed_3, arg1);
        }
        if (arg0.cfr_renamed_145 == 192) {
            if (arg0.cfr_renamed_1226 == 4) {
                sprgbg sprgbg4 = this;
                return sprgbg4.cfr_renamed_6323(sprgbg4.cfr_renamed_3, arg1);
            }
            sprgbg sprgbg5 = this;
            return sprgbg5.cfr_renamed_6323(sprgbg5.cfr_renamed_107, arg1);
        }
        if (arg0.cfr_renamed_145 == 255) {
            sprgbg sprgbg6 = this;
            return sprgbg6.cfr_renamed_6323(sprgbg6.cfr_renamed_3, arg1);
        }
        if (arg0.cfr_renamed_145 == 256) {
            sprgbg sprgbg7 = this;
            return sprgbg7.cfr_renamed_6323(sprgbg7.cfr_renamed_107, arg1);
        }
        return null;
    }

    public static int[] cfr_renamed_6326(Properties arg0, String arg1, int arg2) {
        int n;
        byte[] byArray = sprfqe.cfr_renamed_496(sprgbg.cfr_renamed_6325(arg0.getProperty(arg1)));
        int[] nArray = new int[arg2];
        int n2 = n = 0;
        while (n2 < byArray.length / 4) {
            int n3 = n++;
            nArray[n3] = sprpxe.cfr_renamed_439(byArray, n3 * 4);
            n2 = n;
        }
        return nArray;
    }

    public sprsyf cfr_renamed_6247(sprqag arg0, int arg1) {
        if (arg0.cfr_renamed_145 == 128) {
            sprgbg sprgbg2 = this;
            return sprgbg2.cfr_renamed_6323(sprgbg2.cfr_renamed_93, arg1);
        }
        if (arg0.cfr_renamed_145 == 129) {
            sprgbg sprgbg3 = this;
            return sprgbg3.cfr_renamed_6323(sprgbg3.cfr_renamed_152, arg1);
        }
        if (arg0.cfr_renamed_145 == 192) {
            if (arg0.cfr_renamed_1226 == 4) {
                sprgbg sprgbg4 = this;
                return sprgbg4.cfr_renamed_6323(sprgbg4.cfr_renamed_152, arg1);
            }
            sprgbg sprgbg5 = this;
            return sprgbg5.cfr_renamed_6323(sprgbg5.cfr_renamed_93, arg1);
        }
        if (arg0.cfr_renamed_145 == 255) {
            sprgbg sprgbg6 = this;
            return sprgbg6.cfr_renamed_6323(sprgbg6.cfr_renamed_152, arg1);
        }
        if (arg0.cfr_renamed_145 == 256) {
            sprgbg sprgbg7 = this;
            return sprgbg7.cfr_renamed_6323(sprgbg7.cfr_renamed_93, arg1);
        }
        return null;
    }

    public static int[] cfr_renamed_6322(DataInputStream arg0) throws IOException {
        int n;
        int[] nArray = new int[arg0.readInt()];
        int n2 = n = 0;
        while (n2 != nArray.length) {
            nArray[n++] = arg0.readInt();
            n2 = n;
        }
        return nArray;
    }

    public sprsyf cfr_renamed_6244(sprqag arg0) {
        int n = 0;
        if (arg0.cfr_renamed_145 == 129) {
            sprgbg sprgbg2 = this;
            return sprgbg2.cfr_renamed_6323(sprgbg2.cfr_renamed_119, n);
        }
        if (arg0.cfr_renamed_145 == 192 && arg0.cfr_renamed_1226 == 4) {
            sprgbg sprgbg3 = this;
            return sprgbg3.cfr_renamed_6323(sprgbg3.cfr_renamed_119, n);
        }
        if (arg0.cfr_renamed_145 == 255) {
            sprgbg sprgbg4 = this;
            return sprgbg4.cfr_renamed_6323(sprgbg4.cfr_renamed_119, n);
        }
        return null;
    }

    public sprsyf cfr_renamed_6249(sprqag arg0, int arg1) {
        if (arg0.cfr_renamed_145 == 129) {
            sprgbg sprgbg2 = this;
            return sprgbg2.cfr_renamed_6323(sprgbg2.cfr_renamed_91, arg1);
        }
        if (arg0.cfr_renamed_145 == 192 && arg0.cfr_renamed_1226 == 4) {
            sprgbg sprgbg3 = this;
            return sprgbg3.cfr_renamed_6323(sprgbg3.cfr_renamed_91, arg1);
        }
        if (arg0.cfr_renamed_145 == 255) {
            sprgbg sprgbg4 = this;
            return sprgbg4.cfr_renamed_6323(sprgbg4.cfr_renamed_91, arg1);
        }
        return null;
    }

    public sprsyf cfr_renamed_6267(sprqag arg0, int arg1) {
        if (arg0.cfr_renamed_145 == 128) {
            sprgbg sprgbg2 = this;
            return sprgbg2.cfr_renamed_6323(sprgbg2.cfr_renamed_102, arg1);
        }
        if (arg0.cfr_renamed_145 == 129) {
            sprgbg sprgbg3 = this;
            return sprgbg3.cfr_renamed_6323(sprgbg3.cfr_renamed_112, arg1);
        }
        if (arg0.cfr_renamed_145 == 192) {
            if (arg0.cfr_renamed_1226 == 4) {
                sprgbg sprgbg4 = this;
                return sprgbg4.cfr_renamed_6323(sprgbg4.cfr_renamed_112, arg1);
            }
            sprgbg sprgbg5 = this;
            return sprgbg5.cfr_renamed_6323(sprgbg5.cfr_renamed_102, arg1);
        }
        if (arg0.cfr_renamed_145 == 255) {
            sprgbg sprgbg6 = this;
            return sprgbg6.cfr_renamed_6323(sprgbg6.cfr_renamed_112, arg1);
        }
        if (arg0.cfr_renamed_145 == 256) {
            sprgbg sprgbg7 = this;
            return sprgbg7.cfr_renamed_6323(sprgbg7.cfr_renamed_102, arg1);
        }
        return null;
    }
}

