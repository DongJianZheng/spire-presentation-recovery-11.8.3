/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrh;
import com.spire.presentation.packages.sprehm;
import com.spire.presentation.packages.sprfjm;
import com.spire.presentation.packages.sprgcm;
import com.spire.presentation.packages.sprgwg;
import com.spire.presentation.packages.sprhbm;
import com.spire.presentation.packages.sprhfk;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.spriyg;
import com.spire.presentation.packages.sprkfm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlam;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sproyl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprrd;
import com.spire.presentation.packages.sprrim;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtaca;
import com.spire.presentation.packages.sprtem;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprwcm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;

public class sprpnk {
    private final sprth cfr_renamed_4;

    private static /* synthetic */ byte[][] cfr_renamed_9625(InputStream arg0, sprrd arg1) throws sprtqg, IOException {
        byte[] byArray;
        byte[] byArray2 = null;
        InputStream inputStream = arg0;
        sprhfk.cfr_renamed_9623(inputStream);
        String string = sprhfk.cfr_renamed_9621(inputStream, inputStream.read());
        if (string.equals("protected")) {
            InputStream inputStream2 = arg0;
            String string2 = sprhfk.cfr_renamed_9621(inputStream2, inputStream2.read());
            sprhfk.cfr_renamed_9623(inputStream2);
            sprpik sprpik2 = sprhfk.cfr_renamed_9622(inputStream2);
            byte[] byArray3 = sprhfk.cfr_renamed_9624(inputStream2, inputStream2.read());
            sprhfk.cfr_renamed_9620(inputStream2);
            byte[] byArray4 = sprhfk.cfr_renamed_9624(inputStream2, inputStream2.read());
            sprhfk.cfr_renamed_9620(inputStream2);
            sprgwg sprgwg2 = arg1.cfr_renamed_2776(string2);
            byte[] byArray5 = sprgwg2.cfr_renamed_7761(7, sprpik2);
            byArray = sprgwg2.cfr_renamed_7762(7, byArray5, byArray3, byArray4, 0, byArray4.length);
            if (arg0.read() == 40) {
                int n;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                InputStream inputStream3 = arg0;
                byteArrayOutputStream.write(40);
                while ((n = inputStream3.read()) >= 0 && n != 41) {
                    inputStream3 = arg0;
                    byteArrayOutputStream.write(n);
                }
                if (n != 41) {
                    throw new IOException(sprcrh.cfr_renamed_9("\u000e \u001e6\u000b+\u0018:\u001e*[+\u0015*[:\u0014n(\u000b\u0003>\t"));
                }
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                byteArrayOutputStream2.write(41);
                byArray2 = byteArrayOutputStream2.toByteArray();
            }
        } else {
            if (string.equals("d")) {
                return null;
            }
            throw new sprtqg(sprtaca.cfr_renamed_9("F5Y3S$B\"RgT+Y$]gX(BgP(C)R"));
        }
        InputStream inputStream4 = arg0;
        sprhfk.cfr_renamed_9620(inputStream4);
        sprhfk.cfr_renamed_9620(inputStream4);
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = byArray;
        byArrayArray[1] = byArray2;
        return byArrayArray;
    }

    private /* synthetic */ BigInteger cfr_renamed_9626(InputStream arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, sprrd arg4) throws IOException, sprtqg {
        ByteArrayInputStream byteArrayInputStream;
        byte[][] byArray = sprpnk.cfr_renamed_9625(arg0, arg4);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream = new ByteArrayInputStream(byArray2);
        sprhfk.cfr_renamed_9623(byteArrayInputStream);
        sprhfk.cfr_renamed_9623(byteArrayInputStream2);
        BigInteger bigInteger = this.cfr_renamed_9627("x", byteArrayInputStream);
        sprhfk.cfr_renamed_9620(byteArrayInputStream2);
        sprhfk.cfr_renamed_9623(byteArrayInputStream);
        String string = sprhfk.cfr_renamed_9621(byteArrayInputStream, ((InputStream)byteArrayInputStream).read());
        if (!string.equals("hash")) {
            throw new sprtqg(sprcrh.cfr_renamed_9("\u0013/\b&[%\u001e7\f!\t*[+\u0003>\u001e-\u000f+\u001f"));
        }
        ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream;
        string = sprhfk.cfr_renamed_9621(byteArrayInputStream3, ((InputStream)byteArrayInputStream3).read());
        if (!string.equals("sha1")) {
            throw new sprtqg(sprtaca.cfr_renamed_9("^&E/\u0016,S>A(D#\u0016\"N7S$B\"R"));
        }
        ByteArrayInputStream byteArrayInputStream4 = byteArrayInputStream;
        byte[] byArray4 = sprhfk.cfr_renamed_9624(byteArrayInputStream4, ((InputStream)byteArrayInputStream4).read());
        sprhfk.cfr_renamed_9620(byteArrayInputStream4);
        if (this.cfr_renamed_4 != null) {
            OutputStream outputStream;
            sprpnk sprpnk2 = this;
            sprsm sprsm2 = sprpnk2.cfr_renamed_4.cfr_renamed_576(2);
            OutputStream outputStream2 = outputStream = sprsm2.cfr_renamed_470();
            outputStream2.write(sprkoe.cfr_renamed_433(sprcrh.cfr_renamed_9("fHt\u001e\"\u001c")));
            sprpnk2.cfr_renamed_9628(outputStream2, "p", arg1);
            sprpnk2.cfr_renamed_9628(outputStream, "g", arg2);
            sprpnk2.cfr_renamed_9628(outputStream, "y", arg3);
            sprpnk2.cfr_renamed_9628(outputStream, "x", bigInteger);
            if (byArray3 != null) {
                outputStream.write(byArray3);
            }
            outputStream.write(sprkoe.cfr_renamed_433(")"));
            if (!sproze.cfr_renamed_559(sprsm2.cfr_renamed_580(), byArray4)) {
                throw new sprtqg(sprtaca.cfr_renamed_9("$^\"U,E2[gY)\u00167D(B\"U3S#\u0016#W3WgP&_+S#\u0016.Xge\u0002N7D"));
            }
        }
        return bigInteger;
    }

    private /* synthetic */ BigInteger cfr_renamed_9627(String arg0, InputStream arg1) throws IOException, sprtqg {
        InputStream inputStream = arg1;
        sprhfk.cfr_renamed_9623(inputStream);
        if (!sprhfk.cfr_renamed_9621(inputStream, inputStream.read()).equals(arg0)) {
            throw new sprtqg(new StringBuilder().insert(0, arg0).append(sprcrh.cfr_renamed_9("[8\u001a\"\u000e+[+\u0003>\u001e-\u000f+\u001f")).toString());
        }
        InputStream inputStream2 = arg1;
        byte[] byArray = sprhfk.cfr_renamed_9624(inputStream2, inputStream2.read());
        BigInteger bigInteger = new BigInteger(1, byArray);
        sprhfk.cfr_renamed_9620(inputStream2);
        return bigInteger;
    }

    public spriyg cfr_renamed_7742(InputStream arg0, sprrd arg1, sprvbh arg2) throws IOException, sprtqg {
        InputStream inputStream = arg0;
        sprhfk.cfr_renamed_9623(inputStream);
        String string = sprhfk.cfr_renamed_9621(inputStream, inputStream.read());
        if (string.equals(sprtaca.cfr_renamed_9("F5Y3S$B\"RjF5_1W3Sj]\"O")) || string.equals(sprcrh.cfr_renamed_9("\u000b<\u00128\u001a:\u001ec\u0010+\u0002"))) {
            InputStream inputStream2 = arg0;
            sprhfk.cfr_renamed_9623(inputStream2);
            String string2 = sprhfk.cfr_renamed_9621(inputStream2, inputStream2.read());
            if (string2.equals(sprtaca.cfr_renamed_9("S$U"))) {
                InputStream inputStream3 = arg0;
                sprhfk.cfr_renamed_9623(inputStream3);
                String string3 = sprhfk.cfr_renamed_9621(inputStream3, inputStream3.read());
                String string4 = sprhfk.cfr_renamed_9621(inputStream3, inputStream3.read());
                sprhfk.cfr_renamed_9620(inputStream3);
                sprhfk.cfr_renamed_9623(inputStream3);
                string = sprhfk.cfr_renamed_9621(inputStream3, inputStream3.read());
                if (!string.equals(sprcrh.cfr_renamed_9("\n"))) {
                    throw new sprtqg(sprtaca.cfr_renamed_9(")YgGg@&Z2SgP(C)R"));
                }
                InputStream inputStream4 = arg0;
                byte[] byArray = sprhfk.cfr_renamed_9624(inputStream4, inputStream4.read());
                sprhfk.cfr_renamed_9620(inputStream4);
                BigInteger bigInteger = this.cfr_renamed_9629(arg0, string3, string4, byArray, arg1);
                if (string4.startsWith(sprcrh.cfr_renamed_9("5\u0007(\u001a["))) {
                    string4 = string4.substring(sprtaca.cfr_renamed_9("x\u000ee\u0013\u0016").length());
                }
                sprrim sprrim2 = new sprrim(sprnhm.cfr_renamed_2103(string4), new BigInteger(1, byArray));
                sprtem sprtem2 = (sprtem)arg2.cfr_renamed_7735().cfr_renamed_1521();
                if (!sprrim2.cfr_renamed_7813().cfr_renamed_5078(sprtem2.cfr_renamed_7813()) || !sprrim2.cfr_renamed_7976().equals(sprtem2.cfr_renamed_7976())) {
                    throw new sprtqg(sprcrh.cfr_renamed_9(">\u001a=\b+\u001fn\u0012 [>\u000e,\u0017'\u0018n\u0010+\u0002n\u001f!\u001e=[ \u0014:[#\u001a:\u0018&[=\u001e-\t+\u000fn\u0010+\u0002"));
                }
                return new spriyg(new sprkfm(arg2.cfr_renamed_7735(), 0, null, null, new sprgcm(bigInteger).cfr_renamed_91()), arg2);
            }
            if (string2.equals(sprtaca.cfr_renamed_9("R4W"))) {
                sprpnk sprpnk2 = this;
                BigInteger bigInteger = sprpnk2.cfr_renamed_9627("p", arg0);
                BigInteger bigInteger2 = sprpnk2.cfr_renamed_9627(sprcrh.cfr_renamed_9("\n"), arg0);
                BigInteger bigInteger3 = sprpnk2.cfr_renamed_9627("g", arg0);
                BigInteger bigInteger4 = sprpnk2.cfr_renamed_9627("y", arg0);
                BigInteger bigInteger5 = sprpnk2.cfr_renamed_9630(arg0, bigInteger, bigInteger2, bigInteger3, bigInteger4, arg1);
                sprfjm sprfjm2 = new sprfjm(bigInteger, bigInteger2, bigInteger3, bigInteger4);
                sprfjm sprfjm3 = (sprfjm)arg2.cfr_renamed_7735().cfr_renamed_1521();
                if (!(sprfjm2.cfr_renamed_1155().equals(sprfjm3.cfr_renamed_1155()) && sprfjm2.cfr_renamed_1604().equals(sprfjm3.cfr_renamed_1604()) && sprfjm2.cfr_renamed_1145().equals(sprfjm3.cfr_renamed_1145()) && sprfjm2.spr\u3181().equals(sprfjm3.spr\u3181()))) {
                    throw new sprtqg(sprtaca.cfr_renamed_9("7W4E\"Rg_)\u00167C%Z.Ug]\"OgR(S4\u0016)Y3\u0016*W3U/\u00164S$D\"Bg]\"O"));
                }
                return new spriyg(new sprkfm(arg2.cfr_renamed_7735(), 0, null, null, new sproyl(bigInteger5).cfr_renamed_91()), arg2);
            }
            if (string2.equals(sprcrh.cfr_renamed_9("\u001e\"\u001c"))) {
                sprpnk sprpnk3 = this;
                BigInteger bigInteger = sprpnk3.cfr_renamed_9627("p", arg0);
                BigInteger bigInteger6 = sprpnk3.cfr_renamed_9627("g", arg0);
                BigInteger bigInteger7 = sprpnk3.cfr_renamed_9627("y", arg0);
                BigInteger bigInteger8 = sprpnk3.cfr_renamed_9626(arg0, bigInteger, bigInteger6, bigInteger7, arg1);
                sprehm sprehm2 = new sprehm(bigInteger, bigInteger6, bigInteger7);
                sprehm sprehm3 = (sprehm)arg2.cfr_renamed_7735().cfr_renamed_1521();
                if (!(sprehm2.cfr_renamed_1155().equals(sprehm3.cfr_renamed_1155()) && sprehm2.cfr_renamed_1145().equals(sprehm3.cfr_renamed_1145()) && sprehm2.spr\u3181().equals(sprehm3.spr\u3181()))) {
                    throw new sprtqg(sprtaca.cfr_renamed_9("7W4E\"Rg_)\u00167C%Z.Ug]\"OgR(S4\u0016)Y3\u0016*W3U/\u00164S$D\"Bg]\"O"));
                }
                return new spriyg(new sprkfm(arg2.cfr_renamed_7735(), 0, null, null, new sprlam(bigInteger8).cfr_renamed_91()), arg2);
            }
            if (string2.equals(sprcrh.cfr_renamed_9("\t=\u001a"))) {
                sprpnk sprpnk4 = this;
                BigInteger bigInteger = sprpnk4.cfr_renamed_9627("n", arg0);
                BigInteger bigInteger9 = sprpnk4.cfr_renamed_9627("e", arg0);
                BigInteger[] bigIntegerArray = sprpnk4.cfr_renamed_9631(arg0, bigInteger, bigInteger9, arg1);
                sprwcm sprwcm2 = new sprwcm(bigInteger, bigInteger9);
                sprwcm sprwcm3 = (sprwcm)arg2.cfr_renamed_7735().cfr_renamed_1521();
                if (!sprwcm2.cfr_renamed_2295().equals(sprwcm3.cfr_renamed_2295()) || !sprwcm2.cfr_renamed_2296().equals(sprwcm3.cfr_renamed_2296())) {
                    throw new sprtqg(sprtaca.cfr_renamed_9("7W4E\"Rg_)\u00167C%Z.Ug]\"OgR(S4\u0016)Y3\u0016*W3U/\u00164S$D\"Bg]\"O"));
                }
                return new spriyg(new sprkfm(arg2.cfr_renamed_7735(), 0, null, null, new sprhbm(bigIntegerArray[0], bigIntegerArray[1], bigIntegerArray[2]).cfr_renamed_91()), arg2);
            }
            throw new sprtqg(new StringBuilder().insert(0, sprcrh.cfr_renamed_9(";\u0015%\u0015!\f [%\u001e7[:\u0002>\u001et[")).append(string2).toString());
        }
        throw new sprtqg(sprtaca.cfr_renamed_9("2X,X(A)\u0016,S>\u00163O7SgP(C)R"));
    }

    private /* synthetic */ BigInteger cfr_renamed_9629(InputStream arg0, String arg1, String arg2, byte[] arg3, sprrd arg4) throws IOException, sprtqg {
        ByteArrayInputStream byteArrayInputStream;
        byte[][] byArray = sprpnk.cfr_renamed_9625(arg0, arg4);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream = new ByteArrayInputStream(byArray2);
        sprhfk.cfr_renamed_9623(byteArrayInputStream);
        sprhfk.cfr_renamed_9623(byteArrayInputStream2);
        BigInteger bigInteger = this.cfr_renamed_9627("d", byteArrayInputStream);
        sprhfk.cfr_renamed_9620(byteArrayInputStream2);
        sprhfk.cfr_renamed_9623(byteArrayInputStream);
        String string = sprhfk.cfr_renamed_9621(byteArrayInputStream, ((InputStream)byteArrayInputStream).read());
        if (!string.equals("hash")) {
            throw new sprtqg(sprcrh.cfr_renamed_9("\u0013/\b&[%\u001e7\f!\t*[+\u0003>\u001e-\u000f+\u001f"));
        }
        ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream;
        string = sprhfk.cfr_renamed_9621(byteArrayInputStream3, ((InputStream)byteArrayInputStream3).read());
        if (!string.equals("sha1")) {
            throw new sprtqg(sprtaca.cfr_renamed_9("^&E/\u0016,S>A(D#\u0016\"N7S$B\"R"));
        }
        ByteArrayInputStream byteArrayInputStream4 = byteArrayInputStream;
        byte[] byArray4 = sprhfk.cfr_renamed_9624(byteArrayInputStream4, ((InputStream)byteArrayInputStream4).read());
        sprhfk.cfr_renamed_9620(byteArrayInputStream4);
        if (this.cfr_renamed_4 != null) {
            OutputStream outputStream;
            sprpnk sprpnk2 = this;
            sprsm sprsm2 = sprpnk2.cfr_renamed_4.cfr_renamed_576(2);
            OutputStream outputStream2 = outputStream = sprsm2.cfr_renamed_470();
            outputStream2.write(sprkoe.cfr_renamed_433(sprcrh.cfr_renamed_9("fHt\u001e-\u0018")));
            OutputStream outputStream3 = outputStream;
            outputStream2.write(sprkoe.cfr_renamed_433("(" + arg1.length() + ":" + arg1 + arg2.length() + ":" + arg2 + ")"));
            sprpnk2.cfr_renamed_9632(outputStream2, sprtaca.cfr_renamed_9("G"), arg3);
            sprpnk2.cfr_renamed_9628(outputStream, "d", bigInteger);
            if (byArray3 != null) {
                outputStream.write(byArray3);
            }
            outputStream.write(sprkoe.cfr_renamed_433(")"));
            if (!sproze.cfr_renamed_559(sprsm2.cfr_renamed_580(), byArray4)) {
                throw new sprtqg(sprcrh.cfr_renamed_9("-\u0013+\u0018%\b;\u0016n\u0014 [>\t!\u000f+\u0018:\u001e*[*\u001a:\u001an\u001d/\u0012\"\u001e*['\u0015n(\u000b\u0003>\t"));
            }
        }
        return bigInteger;
    }

    public sprpnk(sprth sprth2) {
        this.cfr_renamed_4 = sprth2;
    }

    public spriyg cfr_renamed_7755(InputStream arg0, sprrd arg1, sprrk arg2) throws IOException, sprtqg {
        InputStream inputStream = arg0;
        sprhfk.cfr_renamed_9623(inputStream);
        String string = sprhfk.cfr_renamed_9621(inputStream, inputStream.read());
        if (string.equals(sprtaca.cfr_renamed_9("F5Y3S$B\"RjF5_1W3Sj]\"O")) || string.equals(sprcrh.cfr_renamed_9("\u000b<\u00128\u001a:\u001ec\u0010+\u0002"))) {
            InputStream inputStream2 = arg0;
            sprhfk.cfr_renamed_9623(inputStream2);
            String string2 = sprhfk.cfr_renamed_9621(inputStream2, inputStream2.read());
            if (string2.equals(sprtaca.cfr_renamed_9("S$U"))) {
                InputStream inputStream3 = arg0;
                sprhfk.cfr_renamed_9623(inputStream3);
                String string3 = sprhfk.cfr_renamed_9621(inputStream3, inputStream3.read());
                String string4 = sprhfk.cfr_renamed_9621(inputStream3, inputStream3.read());
                if (string4.startsWith(sprcrh.cfr_renamed_9("5\u0007(\u001a["))) {
                    string4 = string4.substring(sprtaca.cfr_renamed_9("x\u000ee\u0013\u0016").length());
                }
                InputStream inputStream4 = arg0;
                sprhfk.cfr_renamed_9620(inputStream4);
                sprhfk.cfr_renamed_9623(inputStream4);
                string = sprhfk.cfr_renamed_9621(inputStream4, inputStream4.read());
                if (!string.equals(sprcrh.cfr_renamed_9("\n"))) {
                    throw new sprtqg(sprtaca.cfr_renamed_9(")YgGg@&Z2SgP(C)R"));
                }
                InputStream inputStream5 = arg0;
                byte[] byArray = sprhfk.cfr_renamed_9624(inputStream5, inputStream5.read());
                sprifm sprifm2 = new sprifm(19, new Date(), new sprrim(sprnhm.cfr_renamed_2103(string4), new BigInteger(1, byArray)));
                InputStream inputStream6 = arg0;
                sprhfk.cfr_renamed_9620(inputStream6);
                BigInteger bigInteger = this.cfr_renamed_9629(inputStream6, string3, string4, byArray, arg1);
                return new spriyg(new sprkfm(sprifm2, 0, null, null, new sprgcm(bigInteger).cfr_renamed_91()), new sprvbh(sprifm2, arg2));
            }
            if (string2.equals(sprcrh.cfr_renamed_9("\u001f=\u001a"))) {
                sprpnk sprpnk2 = this;
                BigInteger bigInteger = sprpnk2.cfr_renamed_9627("p", arg0);
                BigInteger bigInteger2 = sprpnk2.cfr_renamed_9627(sprtaca.cfr_renamed_9("G"), arg0);
                BigInteger bigInteger3 = sprpnk2.cfr_renamed_9627("g", arg0);
                BigInteger bigInteger4 = sprpnk2.cfr_renamed_9627("y", arg0);
                BigInteger bigInteger5 = sprpnk2.cfr_renamed_9630(arg0, bigInteger, bigInteger2, bigInteger3, bigInteger4, arg1);
                sprifm sprifm3 = new sprifm(17, new Date(), new sprfjm(bigInteger, bigInteger2, bigInteger3, bigInteger4));
                return new spriyg(new sprkfm(sprifm3, 0, null, null, new sproyl(bigInteger5).cfr_renamed_91()), new sprvbh(sprifm3, arg2));
            }
            if (string2.equals(sprcrh.cfr_renamed_9("\u001e\"\u001c"))) {
                sprpnk sprpnk3 = this;
                BigInteger bigInteger = sprpnk3.cfr_renamed_9627("p", arg0);
                BigInteger bigInteger6 = sprpnk3.cfr_renamed_9627("g", arg0);
                BigInteger bigInteger7 = sprpnk3.cfr_renamed_9627("y", arg0);
                BigInteger bigInteger8 = sprpnk3.cfr_renamed_9626(arg0, bigInteger, bigInteger6, bigInteger7, arg1);
                sprifm sprifm4 = new sprifm(16, new Date(), new sprehm(bigInteger, bigInteger6, bigInteger7));
                return new spriyg(new sprkfm(sprifm4, 0, null, null, new sprlam(bigInteger8).cfr_renamed_91()), new sprvbh(sprifm4, arg2));
            }
            if (string2.equals(sprtaca.cfr_renamed_9("D4W"))) {
                sprpnk sprpnk4 = this;
                BigInteger bigInteger = sprpnk4.cfr_renamed_9627("n", arg0);
                BigInteger bigInteger9 = sprpnk4.cfr_renamed_9627("e", arg0);
                BigInteger[] bigIntegerArray = sprpnk4.cfr_renamed_9631(arg0, bigInteger, bigInteger9, arg1);
                sprifm sprifm5 = new sprifm(1, new Date(), new sprwcm(bigInteger, bigInteger9));
                return new spriyg(new sprkfm(sprifm5, 0, null, null, new sprhbm(bigIntegerArray[0], bigIntegerArray[1], bigIntegerArray[2]).cfr_renamed_91()), new sprvbh(sprifm5, arg2));
            }
            throw new sprtqg(new StringBuilder().insert(0, sprcrh.cfr_renamed_9(";\u0015%\u0015!\f [%\u001e7[:\u0002>\u001et[")).append(string2).toString());
        }
        throw new sprtqg(sprtaca.cfr_renamed_9("2X,X(A)\u0016,S>\u00163O7SgP(C)R"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_9632(OutputStream outputStream, String string, byte[] byArray) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        arg0.write(sprkoe.cfr_renamed_433("(" + arg1.length() + ":" + (String)arg1 + ((void)arg2).length + ":"));
        void v0 = arg0;
        v0.write((byte[])arg2);
        v0.write(sprkoe.cfr_renamed_433(")"));
    }

    private /* synthetic */ BigInteger cfr_renamed_9630(InputStream arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, sprrd arg5) throws IOException, sprtqg {
        ByteArrayInputStream byteArrayInputStream;
        byte[][] byArray = sprpnk.cfr_renamed_9625(arg0, arg5);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream = new ByteArrayInputStream(byArray2);
        sprhfk.cfr_renamed_9623(byteArrayInputStream);
        sprhfk.cfr_renamed_9623(byteArrayInputStream2);
        BigInteger bigInteger = this.cfr_renamed_9627("x", byteArrayInputStream);
        sprhfk.cfr_renamed_9620(byteArrayInputStream2);
        sprhfk.cfr_renamed_9623(byteArrayInputStream);
        String string = sprhfk.cfr_renamed_9621(byteArrayInputStream, ((InputStream)byteArrayInputStream).read());
        if (!string.equals("hash")) {
            throw new sprtqg(sprcrh.cfr_renamed_9("\u0013/\b&[%\u001e7\f!\t*[+\u0003>\u001e-\u000f+\u001f"));
        }
        ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream;
        string = sprhfk.cfr_renamed_9621(byteArrayInputStream3, ((InputStream)byteArrayInputStream3).read());
        if (!string.equals("sha1")) {
            throw new sprtqg(sprtaca.cfr_renamed_9("^&E/\u0016,S>A(D#\u0016\"N7S$B\"R"));
        }
        ByteArrayInputStream byteArrayInputStream4 = byteArrayInputStream;
        byte[] byArray4 = sprhfk.cfr_renamed_9624(byteArrayInputStream4, ((InputStream)byteArrayInputStream4).read());
        sprhfk.cfr_renamed_9620(byteArrayInputStream4);
        if (this.cfr_renamed_4 != null) {
            OutputStream outputStream;
            sprpnk sprpnk2 = this;
            sprsm sprsm2 = sprpnk2.cfr_renamed_4.cfr_renamed_576(2);
            OutputStream outputStream2 = outputStream = sprsm2.cfr_renamed_470();
            outputStream2.write(sprkoe.cfr_renamed_433(sprcrh.cfr_renamed_9("fHt\u001f=\u001a")));
            sprpnk2.cfr_renamed_9628(outputStream2, "p", arg1);
            sprpnk2.cfr_renamed_9628(outputStream, sprtaca.cfr_renamed_9("G"), arg2);
            sprpnk2.cfr_renamed_9628(outputStream, "g", arg3);
            sprpnk2.cfr_renamed_9628(outputStream, "y", arg4);
            sprpnk2.cfr_renamed_9628(outputStream, "x", bigInteger);
            if (byArray3 != null) {
                outputStream.write(byArray3);
            }
            outputStream.write(sprkoe.cfr_renamed_433(")"));
            if (!sproze.cfr_renamed_559(sprsm2.cfr_renamed_580(), byArray4)) {
                throw new sprtqg(sprcrh.cfr_renamed_9("-\u0013+\u0018%\b;\u0016n\u0014 [>\t!\u000f+\u0018:\u001e*[*\u001a:\u001an\u001d/\u0012\"\u001e*['\u0015n(\u000b\u0003>\t"));
            }
        }
        return bigInteger;
    }

    private /* synthetic */ BigInteger[] cfr_renamed_9631(InputStream arg0, BigInteger arg1, BigInteger arg2, sprrd arg3) throws IOException, sprtqg {
        sprpnk sprpnk2;
        BigInteger bigInteger;
        Object object;
        InputStream inputStream;
        byte[][] byArray = sprpnk.cfr_renamed_9625(arg0, arg3);
        byte[] byArray2 = null;
        if (byArray == null) {
            inputStream = arg0;
            object = sprhfk.cfr_renamed_9624(inputStream, inputStream.read());
            bigInteger = new BigInteger(1, (byte[])object);
            sprhfk.cfr_renamed_9620(inputStream);
            sprpnk2 = this;
        } else {
            byte[] byArray3 = byArray[0];
            byArray2 = byArray[1];
            inputStream = new ByteArrayInputStream(byArray3);
            sprpnk sprpnk3 = this;
            sprpnk2 = sprpnk3;
            InputStream inputStream2 = inputStream;
            sprhfk.cfr_renamed_9623(inputStream2);
            sprhfk.cfr_renamed_9623(inputStream2);
            bigInteger = sprpnk3.cfr_renamed_9627("d", inputStream);
        }
        object = sprpnk2.cfr_renamed_9627("p", inputStream);
        sprpnk sprpnk4 = this;
        BigInteger bigInteger2 = sprpnk4.cfr_renamed_9627(sprtaca.cfr_renamed_9("G"), inputStream);
        BigInteger bigInteger3 = sprpnk4.cfr_renamed_9627("u", inputStream);
        if (byArray == null) {
            BigInteger[] bigIntegerArray = new BigInteger[4];
            bigIntegerArray[0] = bigInteger;
            bigIntegerArray[1] = object;
            bigIntegerArray[2] = bigInteger2;
            bigIntegerArray[3] = bigInteger3;
            return bigIntegerArray;
        }
        InputStream inputStream3 = inputStream;
        sprhfk.cfr_renamed_9620(inputStream3);
        sprhfk.cfr_renamed_9623(inputStream3);
        String string = sprhfk.cfr_renamed_9621(inputStream3, inputStream3.read());
        if (!string.equals("hash")) {
            throw new sprtqg(sprcrh.cfr_renamed_9("\u0013/\b&[%\u001e7\f!\t*[+\u0003>\u001e-\u000f+\u001f"));
        }
        InputStream inputStream4 = inputStream;
        string = sprhfk.cfr_renamed_9621(inputStream4, inputStream4.read());
        if (!string.equals("sha1")) {
            throw new sprtqg(sprtaca.cfr_renamed_9("^&E/\u0016,S>A(D#\u0016\"N7S$B\"R"));
        }
        InputStream inputStream5 = inputStream;
        byte[] byArray4 = sprhfk.cfr_renamed_9624(inputStream5, inputStream5.read());
        sprhfk.cfr_renamed_9620(inputStream5);
        if (this.cfr_renamed_4 != null) {
            OutputStream outputStream;
            sprpnk sprpnk5 = this;
            sprsm sprsm2 = sprpnk5.cfr_renamed_4.cfr_renamed_576(2);
            OutputStream outputStream2 = outputStream = sprsm2.cfr_renamed_470();
            outputStream2.write(sprkoe.cfr_renamed_433(sprcrh.cfr_renamed_9("fHt\t=\u001a")));
            sprpnk5.cfr_renamed_9628(outputStream2, "n", arg1);
            sprpnk5.cfr_renamed_9628(outputStream, "e", arg2);
            sprpnk5.cfr_renamed_9628(outputStream, "d", bigInteger);
            sprpnk5.cfr_renamed_9628(outputStream, "p", (BigInteger)object);
            sprpnk5.cfr_renamed_9628(outputStream, sprtaca.cfr_renamed_9("G"), bigInteger2);
            sprpnk5.cfr_renamed_9628(outputStream, "u", bigInteger3);
            if (byArray2 != null) {
                outputStream.write(byArray2);
            }
            outputStream.write(sprkoe.cfr_renamed_433(")"));
            if (!sproze.cfr_renamed_559(sprsm2.cfr_renamed_580(), byArray4)) {
                throw new sprtqg(sprcrh.cfr_renamed_9("-\u0013+\u0018%\b;\u0016n\u0014 [>\t!\u000f+\u0018:\u001e*[*\u001a:\u001an\u001d/\u0012\"\u001e*['\u0015n(\u000b\u0003>\t"));
            }
        }
        BigInteger[] bigIntegerArray = new BigInteger[4];
        bigIntegerArray[0] = bigInteger;
        bigIntegerArray[1] = object;
        bigIntegerArray[2] = bigInteger2;
        bigIntegerArray[3] = bigInteger3;
        return bigIntegerArray;
    }

    private /* synthetic */ void cfr_renamed_9628(OutputStream arg0, String arg1, BigInteger arg2) throws IOException {
        this.cfr_renamed_9632(arg0, arg1, arg2.toByteArray());
    }
}

