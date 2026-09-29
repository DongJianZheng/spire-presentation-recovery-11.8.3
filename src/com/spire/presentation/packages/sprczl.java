/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajm;
import com.spire.presentation.packages.sprcim;
import com.spire.presentation.packages.sprgpk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproci;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class sprczl
extends OutputStream {
    public byte[] cfr_renamed_114;
    public boolean cfr_renamed_96;
    public int cfr_renamed_105;
    public boolean cfr_renamed_137;
    public boolean cfr_renamed_79;
    public String cfr_renamed_107;
    public String cfr_renamed_132;
    public String cfr_renamed_102;
    public String cfr_renamed_93;
    public String cfr_renamed_86;
    public int cfr_renamed_152;
    public Hashtable<String, List<String>> cfr_renamed_112;
    public int cfr_renamed_119;
    public String cfr_renamed_91;
    public static final String cfr_renamed_0 = "Version";
    public String cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    public OutputStream cfr_renamed_3;
    public sprcim cfr_renamed_4;

    public void cfr_renamed_9740(String arg0, String arg1) {
        if (arg1 == null || arg0 == null) {
            return;
        }
        List<String> list = this.cfr_renamed_112.get(arg0);
        if (list == null) {
            list = new ArrayList<String>();
            this.cfr_renamed_112.put(arg0, list);
        }
        list.add(arg1);
    }

    private /* synthetic */ void cfr_renamed_11097(String arg0, String arg1) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length()) {
            this.cfr_renamed_3.write(arg0.charAt(n++));
            n2 = n;
        }
        sprczl sprczl2 = this;
        sprczl2.cfr_renamed_3.write(58);
        sprczl2.cfr_renamed_3.write(32);
        sprczl2.cfr_renamed_3.write(sprkoe.cfr_renamed_431(arg1));
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_86.length()) {
            sprczl sprczl3 = this;
            sprczl3.cfr_renamed_3.write(sprczl3.cfr_renamed_86.charAt(n++));
            n3 = n;
        }
    }

    @Override
    public void flush() throws IOException {
    }

    public sprczl(OutputStream outputStream) {
        sprczl sprczl2 = this;
        sprczl sprczl3 = this;
        sprczl sprczl4 = this;
        sprczl sprczl5 = this;
        sprczl sprczl6 = this;
        this.cfr_renamed_114 = new byte[3];
        sprczl6.cfr_renamed_105 = 0;
        sprczl sprczl7 = this;
        sprczl6.cfr_renamed_4 = new sprajm();
        sprczl6.cfr_renamed_119 = 0;
        sprczl5.cfr_renamed_137 = true;
        sprczl5.cfr_renamed_96 = false;
        sprczl4.cfr_renamed_79 = false;
        sprczl4.cfr_renamed_86 = sprkoe.cfr_renamed_5114();
        sprczl4.cfr_renamed_91 = "-----BEGIN PGP ";
        sprczl3.cfr_renamed_102 = "-----";
        sprczl3.cfr_renamed_132 = "-----END PGP ";
        sprczl2.cfr_renamed_1 = "-----";
        sprczl2.cfr_renamed_107 = "BCPG v@RELEASE_NAME@";
        this.cfr_renamed_112 = new Hashtable();
        this.cfr_renamed_3 = outputStream;
        if (this.cfr_renamed_86 == null) {
            this.cfr_renamed_86 = "\r\n";
        }
        this.cfr_renamed_9741(cfr_renamed_0, this.cfr_renamed_107);
    }

    static {
        byte[] byArray = new byte[64];
        byArray[0] = 65;
        byArray[1] = 66;
        byArray[2] = 67;
        byArray[3] = 68;
        byArray[4] = 69;
        byArray[5] = 70;
        byArray[6] = 71;
        byArray[7] = 72;
        byArray[8] = 73;
        byArray[9] = 74;
        byArray[10] = 75;
        byArray[11] = 76;
        byArray[12] = 77;
        byArray[13] = 78;
        byArray[14] = 79;
        byArray[15] = 80;
        byArray[16] = 81;
        byArray[17] = 82;
        byArray[18] = 83;
        byArray[19] = 84;
        byArray[20] = 85;
        byArray[21] = 86;
        byArray[22] = 87;
        byArray[23] = 88;
        byArray[24] = 89;
        byArray[25] = 90;
        byArray[26] = 97;
        byArray[27] = 98;
        byArray[28] = 99;
        byArray[29] = 100;
        byArray[30] = 101;
        byArray[31] = 102;
        byArray[32] = 103;
        byArray[33] = 104;
        byArray[34] = 105;
        byArray[35] = 106;
        byArray[36] = 107;
        byArray[37] = 108;
        byArray[38] = 109;
        byArray[39] = 110;
        byArray[40] = 111;
        byArray[41] = 112;
        byArray[42] = 113;
        byArray[43] = 114;
        byArray[44] = 115;
        byArray[45] = 116;
        byArray[46] = 117;
        byArray[47] = 118;
        byArray[48] = 119;
        byArray[49] = 120;
        byArray[50] = 121;
        byArray[51] = 122;
        byArray[52] = 48;
        byArray[53] = 49;
        byArray[54] = 50;
        byArray[55] = 51;
        byArray[56] = 52;
        byArray[57] = 53;
        byArray[58] = 54;
        byArray[59] = 55;
        byArray[60] = 56;
        byArray[61] = 57;
        byArray[62] = 43;
        byArray[63] = 47;
        cfr_renamed_2 = byArray;
    }

    public void cfr_renamed_9741(String arg0, String arg1) {
        List<String> list;
        if (arg1 == null) {
            this.cfr_renamed_112.remove(arg0);
            return;
        }
        List<String> list2 = this.cfr_renamed_112.get(arg0);
        if (list2 == null) {
            List<String> list3 = list2 = new ArrayList<String>();
            list = list3;
            this.cfr_renamed_112.put(arg0, list3);
        } else {
            List<String> list4 = list2;
            list = list4;
            list4.clear();
        }
        list.add(arg1);
    }

    public void cfr_renamed_11098() {
        List<String> list = this.cfr_renamed_112.get(cfr_renamed_0);
        this.cfr_renamed_112.clear();
        if (list != null) {
            this.cfr_renamed_112.put(cfr_renamed_0, list);
        }
    }

    private static /* synthetic */ void cfr_renamed_11099(OutputStream arg0, byte[] arg1) throws IOException {
        int n = arg1[0] & 0xFF;
        int n2 = arg1[1] & 0xFF;
        int n3 = arg1[2] & 0xFF;
        OutputStream outputStream = arg0;
        outputStream.write(cfr_renamed_2[n >>> 2 & 0x3F]);
        outputStream.write(cfr_renamed_2[(n << 4 | n2 >>> 4) & 0x3F]);
        outputStream.write(cfr_renamed_2[(n2 << 2 | n3 >>> 6) & 0x3F]);
        outputStream.write(cfr_renamed_2[n3 & 0x3F]);
    }

    public void cfr_renamed_8098(int arg0) throws IOException {
        int[] nArray = new int[1];
        nArray[0] = arg0;
        this.cfr_renamed_11100(nArray);
    }

    public void cfr_renamed_8099() {
        this.cfr_renamed_96 = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_11100(int ... arg0) throws IOException {
        int n;
        StringBuilder stringBuilder = new StringBuilder(sprgpk.cfr_renamed_9("eieie\u0006\r\u0003\u0001\nh\u0014\u000f\u0014h\u0017\u0001\u0003\u0006\u0001\fd\u0005\u0001\u001b\u0017\t\u0003\rieiei"));
        stringBuilder.append(this.cfr_renamed_86);
        int[] nArray = arg0;
        int n2 = nArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            StringBuilder stringBuilder2;
            String string;
            int n4 = nArray[n];
            switch (n4) {
                case 2: {
                    string = "SHA1";
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 8: {
                    string = "SHA256";
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 9: {
                    string = "SHA384";
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 10: {
                    string = "SHA512";
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 12: {
                    string = "SHA3-256";
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 14: {
                    string = sproci.cfr_renamed_9("\\*NQ\"W>P");
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 5: {
                    string = sprgpk.cfr_renamed_9("\t\fv");
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 1: {
                    string = "MD5";
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 3: {
                    string = "RIPEMD160";
                    stringBuilder2 = stringBuilder;
                    break;
                }
                case 11: {
                    string = sproci.cfr_renamed_9("\\*NP=V");
                    stringBuilder2 = stringBuilder;
                    break;
                }
                default: {
                    throw new IOException(new StringBuilder().insert(0, sprgpk.cfr_renamed_9("=*#*'3&d %;,h%$#'6!0 )h0)#h-&d*!/-&\u0007$!)6\u001c!00rd")).append(n4).toString());
                }
            }
            stringBuilder2.append(sproci.cfr_renamed_9("G\u0003|\n5B")).append(string).append(this.cfr_renamed_86);
            n3 = ++n;
        }
        stringBuilder.append(this.cfr_renamed_86);
        int n5 = 0;
        int n6 = n5;
        while (true) {
            if (n6 == stringBuilder.length()) {
                sprczl sprczl2 = this;
                sprczl2.cfr_renamed_96 = true;
                sprczl2.cfr_renamed_79 = true;
                this.cfr_renamed_152 = 0;
                return;
            }
            this.cfr_renamed_3.write(stringBuilder.charAt(n5++));
            n6 = n5;
        }
    }

    @Override
    public void close() throws IOException {
        if (this.cfr_renamed_93 != null) {
            int n;
            int n2;
            if (this.cfr_renamed_105 > 0) {
                int n3 = n2 = 0;
                while (n3 < this.cfr_renamed_105) {
                    sprczl sprczl2 = this;
                    byte by = sprczl2.cfr_renamed_114[n2];
                    sprczl2.cfr_renamed_4.cfr_renamed_11084(by & 0xFF);
                    n3 = ++n2;
                }
                sprczl sprczl3 = this;
                sprczl.cfr_renamed_11101(sprczl3.cfr_renamed_3, sprczl3.cfr_renamed_114, this.cfr_renamed_105);
            }
            int n4 = n2 = 0;
            while (n4 != this.cfr_renamed_86.length()) {
                sprczl sprczl4 = this;
                sprczl4.cfr_renamed_3.write(sprczl4.cfr_renamed_86.charAt(n2++));
                n4 = n2;
            }
            sprczl sprczl5 = this;
            sprczl5.cfr_renamed_3.write(61);
            n2 = sprczl5.cfr_renamed_4.cfr_renamed_97();
            sprczl5.cfr_renamed_114[0] = (byte)(n2 >>> 16);
            sprczl5.cfr_renamed_114[1] = (byte)(n2 >>> 8);
            sprczl5.cfr_renamed_114[2] = (byte)n2;
            sprczl.cfr_renamed_11099(sprczl5.cfr_renamed_3, this.cfr_renamed_114);
            int n5 = n = 0;
            while (n5 != this.cfr_renamed_86.length()) {
                sprczl sprczl6 = this;
                sprczl6.cfr_renamed_3.write(sprczl6.cfr_renamed_86.charAt(n++));
                n5 = n;
            }
            int n6 = n = 0;
            while (n6 != this.cfr_renamed_132.length()) {
                sprczl sprczl7 = this;
                sprczl7.cfr_renamed_3.write(sprczl7.cfr_renamed_132.charAt(n++));
                n6 = n;
            }
            int n7 = n = 0;
            while (n7 != this.cfr_renamed_93.length()) {
                sprczl sprczl8 = this;
                sprczl8.cfr_renamed_3.write(sprczl8.cfr_renamed_93.charAt(n++));
                n7 = n;
            }
            int n8 = n = 0;
            while (n8 != this.cfr_renamed_1.length()) {
                sprczl sprczl9 = this;
                sprczl9.cfr_renamed_3.write(sprczl9.cfr_renamed_1.charAt(n++));
                n8 = n;
            }
            int n9 = n = 0;
            while (n9 != this.cfr_renamed_86.length()) {
                sprczl sprczl10 = this;
                sprczl10.cfr_renamed_3.write(sprczl10.cfr_renamed_86.charAt(n++));
                n9 = n;
            }
            this.cfr_renamed_3.flush();
            this.cfr_renamed_93 = null;
            this.cfr_renamed_137 = true;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprczl(OutputStream outputStream, Hashtable<String, String> hashtable) {
        this((OutputStream)arg0);
        Enumeration<String> enumeration;
        void arg0;
        Enumeration<String> enumeration2 = enumeration = hashtable.keys();
        while (enumeration2.hasMoreElements()) {
            void arg1;
            String string = enumeration.nextElement();
            ArrayList arrayList = new ArrayList();
            enumeration2 = enumeration;
            arrayList.add(arg1.get(string));
            this.cfr_renamed_112.put(string, arrayList);
        }
    }

    public void cfr_renamed_11102() {
        this.cfr_renamed_112.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_11101(OutputStream arg0, byte[] arg1, int arg2) throws IOException {
        switch (arg2) {
            case 1: {
                int n = arg1[0] & 0xFF;
                OutputStream outputStream = arg0;
                OutputStream outputStream2 = arg0;
                outputStream2.write(cfr_renamed_2[n >>> 2 & 0x3F]);
                outputStream2.write(cfr_renamed_2[n << 4 & 0x3F]);
                outputStream.write(61);
                outputStream.write(61);
                return;
            }
            case 2: {
                int n = arg1[0] & 0xFF;
                int n2 = arg1[1] & 0xFF;
                OutputStream outputStream = arg0;
                arg0.write(cfr_renamed_2[n >>> 2 & 0x3F]);
                outputStream.write(cfr_renamed_2[(n << 4 | n2 >>> 4) & 0x3F]);
                outputStream.write(cfr_renamed_2[n2 << 2 & 0x3F]);
                outputStream.write(61);
                return;
            }
            case 3: {
                int n = arg1[0] & 0xFF;
                int n3 = arg1[1] & 0xFF;
                int n4 = arg1[2] & 0xFF;
                OutputStream outputStream = arg0;
                outputStream.write(cfr_renamed_2[n >>> 2 & 0x3F]);
                outputStream.write(cfr_renamed_2[(n << 4 | n3 >>> 4) & 0x3F]);
                outputStream.write(cfr_renamed_2[(n3 << 2 | n4 >>> 6) & 0x3F]);
                outputStream.write(cfr_renamed_2[n4 & 0x3F]);
                return;
            }
        }
        throw new IOException(sprgpk.cfr_renamed_9("=*#*'3&d$!&#<,h-&d-*++,!"));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void write(int arg0) throws IOException {
        int n;
        if (this.cfr_renamed_96) {
            sprczl sprczl2 = this;
            sprczl2.cfr_renamed_3.write(arg0);
            if (sprczl2.cfr_renamed_79) {
                if (arg0 != 10 || this.cfr_renamed_152 != 13) {
                    this.cfr_renamed_79 = false;
                }
                if (arg0 == 45) {
                    sprczl sprczl3 = this;
                    sprczl3.cfr_renamed_3.write(32);
                    sprczl3.cfr_renamed_3.write(45);
                }
            }
            if (arg0 == 13 || arg0 == 10 && this.cfr_renamed_152 != 13) {
                this.cfr_renamed_79 = true;
            }
            this.cfr_renamed_152 = arg0;
            return;
        }
        if (this.cfr_renamed_137) {
            int n2;
            int n3;
            n = (arg0 & 0x40) != 0 ? 1 : 0;
            int n4 = 0;
            int n5 = arg0;
            switch (n != 0 ? (n4 = n5 & 0x3F) : (n4 = (n5 & 0x3F) >> 2)) {
                case 6: {
                    this.cfr_renamed_93 = "PUBLIC KEY BLOCK";
                    break;
                }
                case 5: {
                    this.cfr_renamed_93 = "PRIVATE KEY BLOCK";
                    break;
                }
                case 2: {
                    this.cfr_renamed_93 = "SIGNATURE";
                    break;
                }
                default: {
                    this.cfr_renamed_93 = "MESSAGE";
                }
            }
            int n6 = n3 = 0;
            while (n6 != this.cfr_renamed_91.length()) {
                sprczl sprczl4 = this;
                sprczl4.cfr_renamed_3.write(sprczl4.cfr_renamed_91.charAt(n3++));
                n6 = n3;
            }
            int n7 = n3 = 0;
            while (n7 != this.cfr_renamed_93.length()) {
                sprczl sprczl5 = this;
                sprczl5.cfr_renamed_3.write(sprczl5.cfr_renamed_93.charAt(n3++));
                n7 = n3;
            }
            int n8 = n3 = 0;
            while (n8 != this.cfr_renamed_102.length()) {
                sprczl sprczl6 = this;
                sprczl6.cfr_renamed_3.write(sprczl6.cfr_renamed_102.charAt(n3++));
                n8 = n3;
            }
            int n9 = n3 = 0;
            while (n9 != this.cfr_renamed_86.length()) {
                sprczl sprczl7 = this;
                sprczl7.cfr_renamed_3.write(sprczl7.cfr_renamed_86.charAt(n3++));
                n9 = n3;
            }
            if (this.cfr_renamed_112.containsKey(cfr_renamed_0)) {
                sprczl sprczl8 = this;
                sprczl8.cfr_renamed_11097(cfr_renamed_0, sprczl8.cfr_renamed_112.get(cfr_renamed_0).get(0));
            }
            Enumeration<String> enumeration = this.cfr_renamed_112.keys();
            while (enumeration.hasMoreElements()) {
                String string = enumeration.nextElement();
                if (string.equals(cfr_renamed_0)) continue;
                Iterator<String> iterator = this.cfr_renamed_112.get(string).iterator();
                while (iterator.hasNext()) {
                    Iterator<String> iterator2;
                    this.cfr_renamed_11097(string, iterator2.next());
                    iterator = iterator2;
                }
            }
            int n10 = n2 = 0;
            while (n10 != this.cfr_renamed_86.length()) {
                sprczl sprczl9 = this;
                sprczl9.cfr_renamed_3.write(sprczl9.cfr_renamed_86.charAt(n2++));
                n10 = n2;
            }
            this.cfr_renamed_137 = false;
        }
        if (this.cfr_renamed_105 == 3) {
            sprczl sprczl10 = this;
            sprczl sprczl11 = this;
            sprczl11.cfr_renamed_4.cfr_renamed_11083(sprczl11.cfr_renamed_114, 0);
            sprczl.cfr_renamed_11099(sprczl10.cfr_renamed_3, this.cfr_renamed_114);
            sprczl10.cfr_renamed_105 = 0;
            if ((++sprczl10.cfr_renamed_119 & 0xF) == 0) {
                int n11 = n = 0;
                while (n11 != this.cfr_renamed_86.length()) {
                    sprczl sprczl12 = this;
                    sprczl12.cfr_renamed_3.write(sprczl12.cfr_renamed_86.charAt(n++));
                    n11 = n;
                }
            }
        }
        this.cfr_renamed_114[this.cfr_renamed_105++] = (byte)arg0;
    }
}

