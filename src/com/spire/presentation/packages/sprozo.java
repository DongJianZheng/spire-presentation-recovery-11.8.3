/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToHtmlOption;
import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.sprcso;
import com.spire.presentation.packages.sprcxo;
import com.spire.presentation.packages.spreap;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfxo;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprhqo;
import com.spire.presentation.packages.spridja;
import com.spire.presentation.packages.sprjap;
import com.spire.presentation.packages.sprjt;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprnfka;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprppo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrqia;
import com.spire.presentation.packages.sprrqo;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtto;
import com.spire.presentation.packages.sprtwo;
import com.spire.presentation.packages.sprueaa;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxap;
import com.spire.presentation.packages.sprzsp;
import java.util.Iterator;

@sprtea
public class sprozo {
    private int cfr_renamed_107;
    private static final sprusca cfr_renamed_132;
    private String cfr_renamed_102;
    private int cfr_renamed_93;
    private String cfr_renamed_86;
    private int cfr_renamed_152;
    private sprzsp cfr_renamed_112;
    private sprnfka cfr_renamed_119;
    @sprtea
    public sprcso cfr_renamed_91;
    private String cfr_renamed_0;
    private boolean cfr_renamed_1;
    private String cfr_renamed_2;
    @sprtea
    public sprcxo cfr_renamed_3;
    private String[] cfr_renamed_4;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean cfr_renamed_17372(String arg0, String[] arg1, String[] arg2, String[] arg3, int[] arg4) {
        String string = "";
        boolean bl = false;
        arg4[0] = 0;
        int n = 0;
        char[] cArray = arg0.toCharArray();
        if (!this.cfr_renamed_17373(arg0, n, arg4, '[', ']', arg1)) return false;
        if (arg4[0] < arg0.length() - 1 && cArray[arg4[0] + 1] == '(') {
            bl = true;
        }
        String[] stringArray = new String[1];
        stringArray[0] = string;
        String[] stringArray2 = stringArray;
        boolean bl2 = bl && this.cfr_renamed_17373(arg0, arg4[0] + 1, arg4, '(', ')', stringArray2);
        string = stringArray2[0];
        if (!bl2) return false;
        if (!sprraia.cfr_renamed_12280(string) && string.contains(Character.toString(','))) {
            String[] stringArray3 = this.cfr_renamed_17374(string, ',');
            if (stringArray3.length != 2) return false;
            stringArray3[0] = sprraia.cfr_renamed_17375(stringArray3[0]);
            if (stringArray3[0].contains(Character.toString(' '))) {
                return false;
            }
            arg2[0] = stringArray3[0];
            if (stringArray3[1].startsWith(" ")) {
                stringArray3[1] = sprraia.cfr_renamed_12806(stringArray3[1]);
                if (!stringArray3[1].startsWith(Character.toString('\"')) || !stringArray3[1].endsWith(Character.toString('\"'))) return false;
                arg3[0] = stringArray3[1].substring(1, 1 + (stringArray3[1].length() - 2));
                return true;
            } else {
                arg2[0] = string;
            }
            return true;
        } else {
            arg2[0] = string;
        }
        return true;
    }

    private /* synthetic */ void cfr_renamed_17376(sprvrx<sprnyja> arg0, int arg1, String arg2, String arg3) {
        int n;
        int n2 = n = arg1 + 1;
        while (n2 < arg0.size()) {
            sprnyja sprnyja2 = arg0.cfr_renamed_12151(n);
            if (this.cfr_renamed_17377(sprnyja2)) {
                String string = (String)sprnyja2.getKey();
                this.cfr_renamed_17378(arg0, n, "Text", string);
            }
            n2 = ++n;
        }
        this.cfr_renamed_17378(arg0, arg1, arg2, SaveToHtmlOption.cfr_renamed_9("<\u001b\u000e\u001d\u001b"));
        arg0.add(new sprnyja(arg3, "End"));
    }

    private /* synthetic */ boolean cfr_renamed_17373(String arg0, int arg1, int[] arg2, char arg3, char arg4, String[] arg5) {
        sprnfka<Character> sprnfka2;
        block8: {
            int n;
            sprnfka<Character> sprnfka3 = new sprnfka<Character>();
            char[] cArray = arg0.toCharArray();
            boolean bl = true;
            int n2 = n = arg1;
            while (n2 < cArray.length) {
                if (cArray[n] == arg3) {
                    sprnfka3.cfr_renamed_12516(Character.valueOf(arg3));
                    if (bl) {
                        arg1 = n;
                        bl = false;
                    }
                } else if (cArray[n] == arg4 && cArray[n - 1] != '\\') {
                    if (sprnfka3.size() == 0) {
                        return false;
                    }
                    sprnfka<Character> sprnfka4 = sprnfka3;
                    sprnfka4.cfr_renamed_12514();
                    if (sprnfka4.size() == 0) {
                        sprnfka2 = sprnfka3;
                        arg2[0] = n;
                        break block8;
                    }
                }
                n2 = ++n;
            }
            sprnfka2 = sprnfka3;
        }
        if (sprnfka2.size() > 0) {
            return false;
        }
        arg5[0] = sprraia.cfr_renamed_12806(arg0.substring(arg1 + 1, arg1 + 1 + (arg2[0] - arg1 - 1)));
        return true;
    }

    private /* synthetic */ byte[] cfr_renamed_17379(String arg0) {
        byte[] byArray = null;
        try {
            if (this.cfr_renamed_91 != null && this.cfr_renamed_91.cfr_renamed_17292()) {
                sprtto sprtto2 = null;
                sprtto2 = this.cfr_renamed_91.cfr_renamed_17293(null, arg0);
                if (sprtto2.cfr_renamed_17297() != null) {
                    spreen spreen2 = sprtto2.cfr_renamed_17297();
                    byArray = sprmvo.cfr_renamed_12452(spreen2);
                }
            } else if (arg0.startsWith(sprueaa.cfr_renamed_9("m-}-3%d-n)&"))) {
                String string = arg0;
                int n = string.indexOf(",");
                arg0 = string.substring(n + 1);
                sprpdja sprpdja2 = new sprpdja(sprpkja.cfr_renamed_15576(arg0));
                byArray = sprpdja2.cfr_renamed_4529();
            } else if (arg0.startsWith("http") || arg0.startsWith("ftp")) {
                sprrqia sprrqia2 = sprrqia.cfr_renamed_14624(arg0);
                sprrqia2.cfr_renamed_17380("GET");
                spreen spreen3 = sprrqia2.cfr_renamed_3262().cfr_renamed_17381();
                byArray = sprmvo.cfr_renamed_12452(spreen3);
            } else if (sprbhja.cfr_renamed_11642(arg0)) {
                sprgfja sprgfja2 = new sprgfja(arg0, 3);
                byArray = sprmvo.cfr_renamed_12452(sprgfja2);
            } else if (sprbhja.cfr_renamed_11642(new StringBuilder().insert(0, "\\").append(arg0).toString())) {
                sprgfja sprgfja3 = new sprgfja(new StringBuilder().insert(0, "\\").append(arg0).toString(), 3);
                byArray = sprmvo.cfr_renamed_12452(sprgfja3);
            }
        }
        catch (Exception exception) {
            byArray = null;
        }
        return byArray;
    }

    @sprtea
    public void cfr_renamed_17382() {
        String string;
        String string2;
        sprozo sprozo2 = this;
        --sprozo2.cfr_renamed_93;
        if (sprozo2.cfr_renamed_17383()) {
            sprozo sprozo3 = this;
            string2 = sprozo3.cfr_renamed_4[sprozo3.cfr_renamed_93];
        } else {
            string2 = null;
        }
        sprozo2.cfr_renamed_102 = string2;
        sprozo sprozo4 = this;
        if (sprozo4.cfr_renamed_93 > 0) {
            sprozo sprozo5 = this;
            string = sprozo5.cfr_renamed_4[sprozo5.cfr_renamed_93 - 1];
        } else {
            string = "";
        }
        sprozo4.cfr_renamed_17384(string);
    }

    @sprtea
    public boolean cfr_renamed_17385() {
        return this.cfr_renamed_102.startsWith("    ") && !sprraia.cfr_renamed_12280(this.cfr_renamed_102) && this.cfr_renamed_93 == 0 || this.cfr_renamed_102.startsWith("    ") && !sprraia.cfr_renamed_12280(this.cfr_renamed_102) && (sprraia.cfr_renamed_12280(this.cfr_renamed_17386()) || this.cfr_renamed_17387() instanceof sprjap && spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprjap.class).cfr_renamed_17350() || this.cfr_renamed_17387() instanceof sprhqo && spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprhqo.class).cfr_renamed_17336() != 0);
    }

    @sprtea
    public String cfr_renamed_8520() {
        String string;
        sprozo sprozo2 = this;
        sprozo2.cfr_renamed_17384(sprozo2.cfr_renamed_102);
        ++sprozo2.cfr_renamed_93;
        if (sprozo2.cfr_renamed_17383()) {
            sprozo sprozo3 = this;
            string = sprozo3.cfr_renamed_4[sprozo3.cfr_renamed_93];
        } else {
            string = null;
        }
        sprozo2.cfr_renamed_102 = string;
        return this.cfr_renamed_102;
    }

    @sprtea
    public void cfr_renamed_2637() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4 = null;
        }
        if (this.cfr_renamed_112 != null) {
            this.cfr_renamed_112.cfr_renamed_722();
            this.cfr_renamed_112 = null;
        }
        if (this.cfr_renamed_119 != null) {
            this.cfr_renamed_119.cfr_renamed_722();
            this.cfr_renamed_119 = null;
        }
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void cfr_renamed_17388(sprvrx<sprnyja> var1_1, sprhqo var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [21[DOLOOP]], but top level block is 22[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @sprtea
    public void cfr_renamed_17389() {
        sprozo sprozo2;
        Object object;
        String string;
        block18: {
            block17: {
                block15: {
                    block16: {
                        Object object2;
                        Object object3;
                        Object object4;
                        if (sprraia.cfr_renamed_12280(this.cfr_renamed_102)) {
                            return;
                        }
                        if (this.cfr_renamed_17390()) {
                            sprhqo sprhqo2 = this.cfr_renamed_3.cfr_renamed_17367();
                            sprxap sprxap2 = sprhqo2.cfr_renamed_17331();
                            sprxap2.cfr_renamed_15489(this.cfr_renamed_102);
                            sprxap2.cfr_renamed_17302().cfr_renamed_17304(true);
                            return;
                        }
                        String string2 = "";
                        boolean bl = false;
                        sprozo sprozo3 = this;
                        char[] cArray = new char[1];
                        cArray[0] = 32;
                        string = sprraia.cfr_renamed_15325(sprozo3.cfr_renamed_102, cArray);
                        String string3 = sprozo3.cfr_renamed_17391(string, '#');
                        if (!sprraia.cfr_renamed_12280(string3)) {
                            char[] cArray2 = new char[1];
                            cArray2[0] = 35;
                            if (sprraia.cfr_renamed_12280(sprraia.cfr_renamed_11765(string, cArray2))) {
                                return;
                            }
                        }
                        object = new sprhqo();
                        if (!sprraia.cfr_renamed_12280(string3) && string3.length() <= 6 && string3.length() < sprraia.cfr_renamed_12806(string).length() && sprraia.cfr_renamed_12280(string.substring(string3.length(), string3.length() + 1)) && !this.cfr_renamed_102.startsWith("    ")) {
                            sprhqo sprhqo3 = object;
                            sprhqo sprhqo4 = object;
                            sprhqo4.cfr_renamed_17338(sprueaa.cfr_renamed_9("\u0004l-m%g+)") + string3.length(), sprhqo4);
                            string = sprraia.cfr_renamed_12806(string);
                            object4 = sprraia.cfr_renamed_434(string, ' ');
                            object3 = object4[((String[])object4).length - 1];
                            object2 = this.cfr_renamed_17391((String)object3, '#');
                            String string4 = string;
                            if (sprraia.cfr_renamed_11730((String)object2, (String)object3)) {
                                char[] cArray3 = new char[1];
                                cArray3[0] = 35;
                                string = sprraia.cfr_renamed_12806(sprraia.cfr_renamed_11765(string4, cArray3));
                            } else {
                                char[] cArray4 = new char[1];
                                cArray4[0] = 35;
                                string = sprraia.cfr_renamed_12806(sprraia.cfr_renamed_15325(string4, cArray4));
                            }
                        } else {
                            String[] stringArray = new String[1];
                            stringArray[0] = string2;
                            object4 = stringArray;
                            boolean[] blArray = new boolean[1];
                            blArray[0] = bl;
                            object3 = blArray;
                            boolean bl2 = this.cfr_renamed_17392(string, (String[])object4, (boolean[])object3, false);
                            string2 = object4[0];
                            bl = object3[0];
                            if (bl2) {
                                sprhqo sprhqo5 = object;
                                sprhqo5.cfr_renamed_17334(new sprtwo());
                                sprhqo5.cfr_renamed_17335().cfr_renamed_17355(this.cfr_renamed_107);
                                if (bl) {
                                    ((sprhqo)object).cfr_renamed_17335().cfr_renamed_17360(new StringBuilder().insert(0, string2).append('.').toString());
                                }
                                ((sprhqo)object).cfr_renamed_17335().cfr_renamed_17358(bl);
                                String string5 = string;
                                string = string5.substring(string5.indexOf(32) + 1);
                            }
                        }
                        if (((sprhqo)object).cfr_renamed_17336() != 0 || ((sprhqo)object).cfr_renamed_17335() != null) break block15;
                        if (!(this.cfr_renamed_17387() instanceof sprhqo) || spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprhqo.class).cfr_renamed_17336() != 0 || sprraia.cfr_renamed_12280(this.cfr_renamed_17386())) break block16;
                        object4 = spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprhqo.class);
                        Object object5 = object3 = ((sprhqo)object4).cfr_renamed_17332().size() > 0 ? spresca.cfr_renamed_11777(((sprhqo)object4).cfr_renamed_17332().cfr_renamed_12151(((sprhqo)object4).cfr_renamed_17332().size() - 1), sprxap.class) : null;
                        if (object3 != null && ((sprxap)object3).cfr_renamed_13030().length() > 0 && (((sprxap)object3).cfr_renamed_13030().endsWith("  ") || ((sprxap)object3).cfr_renamed_13030().charAt(((sprxap)object3).cfr_renamed_13030().length() - 1) == '\\')) {
                            if (((sprxap)object3).cfr_renamed_13030().charAt(((sprxap)object3).cfr_renamed_13030().length() - 1) == '\\') {
                                Object object6 = object3;
                                ((sprxap)object6).cfr_renamed_15489(((sprxap)object6).cfr_renamed_13030().substring(0, 0 + (((sprxap)object3).cfr_renamed_13030().length() - 2)));
                            }
                            this.cfr_renamed_3.cfr_renamed_17346().add((sprjt)object);
                        } else {
                            object = object4;
                            if (object3 != null) {
                                Object object7 = object3;
                                ((sprxap)object7).cfr_renamed_15489(((sprxap)object7).cfr_renamed_13030().endsWith(Character.toString(' ')) ? ((sprxap)object3).cfr_renamed_13030() : new StringBuilder().insert(0, ((sprxap)object3).cfr_renamed_13030()).append(Character.toString(' ')).toString());
                            } else {
                                object2 = ((sprhqo)object).cfr_renamed_17331();
                                ((sprxap)object2).cfr_renamed_15489(Character.toString(' '));
                            }
                        }
                        break block17;
                    }
                    sprozo sprozo4 = this;
                    sprozo2 = sprozo4;
                    sprozo4.cfr_renamed_3.cfr_renamed_17346().add((sprjt)object);
                    break block18;
                }
                this.cfr_renamed_3.cfr_renamed_17346().add((sprjt)object);
            }
            sprozo2 = this;
        }
        sprozo2.cfr_renamed_17393(string, (sprhqo)object);
    }

    @sprtea
    public void cfr_renamed_17394(String arg0, sprppo arg1) {
        Object object;
        String string = sprraia.cfr_renamed_12806(arg0);
        int n = -1;
        do {
            int n2;
            ++n;
            object = this.cfr_renamed_17374(string, '|');
            spreap spreap2 = spresca.cfr_renamed_11777(arg1.cfr_renamed_17324(), spreap.class);
            int n3 = n2 = 0;
            while (n3 < ((String[])object).length && n2 < arg1.cfr_renamed_17323().cfr_renamed_11861()) {
                String string2 = object[n2];
                sprrqo sprrqo2 = spreap2.cfr_renamed_17320();
                sprhqo sprhqo2 = new sprhqo();
                sprozo sprozo2 = this;
                sprozo2.cfr_renamed_17393(string2, sprhqo2);
                sprozo2.cfr_renamed_17395(sprhqo2, sprrqo2, n == 0);
                n3 = ++n2;
            }
            string = this.cfr_renamed_8520();
            String string3 = string = !sprraia.cfr_renamed_12280(string) ? sprraia.cfr_renamed_12806(string) : null;
        } while (!sprraia.cfr_renamed_12280(string) && this.cfr_renamed_17396(string));
        sprozo sprozo3 = this;
        if (sprraia.cfr_renamed_12280(string)) {
            object = sprozo3.cfr_renamed_3.cfr_renamed_17367();
            object.cfr_renamed_17331().cfr_renamed_15489("");
            return;
        }
        if (!sprozo3.cfr_renamed_17396(string)) {
            --this.cfr_renamed_93;
        }
    }

    private /* synthetic */ void cfr_renamed_17397(sprvrx arg0, StringBuilder[] arg1) {
        if (arg1[0].length() != 0) {
            arg0.add(new sprnyja("Text", arg1[0].toString()));
            arg1[0] = new StringBuilder();
        }
    }

    private /* synthetic */ boolean cfr_renamed_17398(String arg0, sprppo[] arg1) {
        String string = sprraia.cfr_renamed_12806(arg0);
        arg1[0] = null;
        if (this.cfr_renamed_17396(string) && this.cfr_renamed_17383()) {
            String string2 = this.cfr_renamed_8520();
            String string3 = string2 = !sprraia.cfr_renamed_12280(string2) ? sprraia.cfr_renamed_12806(string2) : null;
            if (!sprraia.cfr_renamed_12280(string2) && this.cfr_renamed_17396(string2)) {
                String[] stringArray;
                sprozo sprozo2 = this;
                String[] stringArray2 = sprozo2.cfr_renamed_17374(string, '|');
                if (stringArray2.length == (stringArray = sprozo2.cfr_renamed_17374(string2, '|')).length) {
                    int n;
                    int n2;
                    int n3 = n2 = 0;
                    while (n3 < stringArray.length) {
                        int n4 = n2;
                        stringArray[n4] = sprraia.cfr_renamed_12806(stringArray[n4]);
                        char[] cArray = new char[1];
                        cArray[0] = 58;
                        String string4 = sprraia.cfr_renamed_11765(stringArray[n2], cArray);
                        if (string4.contains(Character.toString('-'))) {
                            if (!sprraia.cfr_renamed_12280(string4 = string4.replace(Character.toString('-'), ""))) {
                                this.cfr_renamed_17382();
                                return false;
                            }
                        } else {
                            this.cfr_renamed_17382();
                            return false;
                        }
                        n3 = ++n2;
                    }
                    arg1[0] = this.cfr_renamed_3.cfr_renamed_17368();
                    String[] stringArray3 = stringArray;
                    int n5 = stringArray.length;
                    int n6 = n = 0;
                    while (n6 < n5) {
                        String string5 = stringArray3[n];
                        if (!sprraia.cfr_renamed_12280(string5)) {
                            if (string5.startsWith(":") && !string5.endsWith(":")) {
                                arg1[0].cfr_renamed_17323().cfr_renamed_12819(0);
                            } else if (!string5.startsWith(":") && string5.endsWith(":")) {
                                arg1[0].cfr_renamed_17323().cfr_renamed_12819(1);
                            } else {
                                arg1[0].cfr_renamed_17323().cfr_renamed_12819(2);
                            }
                        }
                        n6 = ++n;
                    }
                    return true;
                }
                this.cfr_renamed_17382();
                return false;
            }
            this.cfr_renamed_17382();
            return false;
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_17399(sprhqo arg0, String arg1) {
        sprxap sprxap2 = arg0.cfr_renamed_17331();
        sprozo sprozo2 = this;
        sprxap sprxap3 = sprxap2;
        sprozo2.cfr_renamed_17400(sprxap3.cfr_renamed_17302());
        sprxap3.cfr_renamed_15489(sprozo2.cfr_renamed_17401(arg1));
    }

    static {
        String[] stringArray = new String[15];
        stringArray[0] = "text";
        stringArray[1] = "hyperlink";
        stringArray[2] = "img";
        stringArray[3] = SaveToHtmlOption.cfr_renamed_9("\u000b\u0006\u001c\u001f\u0003\u000e\u0016\u001b\n\u0017\u001b");
        stringArray[4] = "url";
        stringArray[5] = sprueaa.cfr_renamed_9("z/{)l\"}%y");
        stringArray[6] = SaveToHtmlOption.cfr_renamed_9("\u000e\u0003\u001b\u001b\n\u0017\u001b");
        stringArray[7] = "src";
        stringArray[8] = "**";
        stringArray[9] = "*";
        stringArray[10] = "~~";
        stringArray[11] = "<sup>";
        stringArray[12] = "<sub>";
        stringArray[13] = sprueaa.cfr_renamed_9("i");
        stringArray[14] = "<!--";
        cfr_renamed_132 = new sprusca(stringArray);
    }

    @sprtea
    public void cfr_renamed_17402() {
        int n;
        sprjap sprjap2 = spresca.cfr_renamed_11777(this.cfr_renamed_3.cfr_renamed_17366(), sprjap.class);
        sprozo sprozo2 = this;
        sprjap2.cfr_renamed_17102().add(sprraia.cfr_renamed_12269(this.cfr_renamed_102, 0, 4));
        sprozo sprozo3 = sprozo2;
        sprjap2.cfr_renamed_17370(false);
        sprozo2.cfr_renamed_8520();
        while (sprozo3.cfr_renamed_102 != null && (this.cfr_renamed_102.startsWith("    ") || sprraia.cfr_renamed_12280(this.cfr_renamed_102))) {
            sprozo sprozo4;
            if (sprraia.cfr_renamed_12280(this.cfr_renamed_102)) {
                sprozo sprozo5 = this;
                sprozo4 = sprozo5;
                sprjap2.cfr_renamed_17102().add(sprozo5.cfr_renamed_102);
            } else {
                sprjap2.cfr_renamed_17102().add(sprraia.cfr_renamed_12269(this.cfr_renamed_102, 0, 4));
                sprozo4 = this;
            }
            sprozo4.cfr_renamed_8520();
            sprozo3 = this;
        }
        this.cfr_renamed_1 = true;
        int n2 = n = sprjap2.cfr_renamed_17102().size() - 1;
        while (n2 >= 0 && sprraia.cfr_renamed_12280(sprjap2.cfr_renamed_17102().cfr_renamed_12151(n))) {
            sprjap2.cfr_renamed_17102().cfr_renamed_12148(n--);
            n2 = n;
        }
    }

    private /* synthetic */ boolean cfr_renamed_17377(sprnyja arg0) {
        return (sprraia.cfr_renamed_11730(String.valueOf(arg0.getKey()), "**".toString()) || sprraia.cfr_renamed_11730(String.valueOf(arg0.getKey()), Character.toString('*')) || sprraia.cfr_renamed_11730(String.valueOf(arg0.getKey()), "~~".toString()) || sprraia.cfr_renamed_11730(String.valueOf(arg0.getKey()), "<sub>".toString()) || sprraia.cfr_renamed_11730(String.valueOf(arg0.getKey()), "<sup>".toString())) && SaveToHtmlOption.cfr_renamed_9(" \u001f\n\u0001\n\u001d").equals(arg0.getValue());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17378(sprvrx sprvrx2, int n, String string, String string2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_12148((int)arg1);
        void v1 = arg1;
        v0.cfr_renamed_12929(n, new sprnyja(arg2, arg3));
    }

    private /* synthetic */ String cfr_renamed_17403(String arg0) {
        char c;
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = 0;
        while (n2 < arg0.length() && Character.isDigit(c = arg0.charAt(n))) {
            stringBuilder.append(c);
            n2 = ++n;
        }
        return stringBuilder.toString();
    }

    @sprtea
    public boolean cfr_renamed_17404(String arg0, char arg1) {
        char[] cArray = new char[1];
        cArray[0] = arg1;
        return sprraia.cfr_renamed_12280(sprraia.cfr_renamed_11765(arg0, cArray));
    }

    @sprtea
    public void cfr_renamed_17384(String arg0) {
        this.cfr_renamed_0 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17405(sprvrx sprvrx2, String string, String string2, String string3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        arg0.add(new sprnyja(sprueaa.cfr_renamed_9("A5y){ `\"b"), SaveToHtmlOption.cfr_renamed_9("<\u001b\u000e\u001d\u001b")));
        arg0.add(new sprnyja(sprueaa.cfr_renamed_9("M%z<e-p\u0018l4}"), arg1));
        arg0.add(new sprnyja("Url", arg2));
        arg0.add(new sprnyja(SaveToHtmlOption.cfr_renamed_9("<\f\u001d\n\n\u0001;\u0006\u001f"), arg3));
        arg0.add(new sprnyja(sprueaa.cfr_renamed_9("A5y){ `\"b"), "End"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17406(sprvrx sprvrx2, StringBuilder[] stringBuilderArray, int[] nArray, char c, int n, String string, String string2) {
        void arg3;
        void arg1;
        void arg5;
        void arg0;
        int n2 = arg0.indexOf(new sprnyja(arg5, SaveToHtmlOption.cfr_renamed_9(" \u001f\n\u0001\n\u001d")));
        if (n2 > -1) {
            void arg4;
            void arg6;
            void arg2;
            void v0 = arg2;
            sprozo sprozo2 = this;
            sprozo2.cfr_renamed_17397((sprvrx)arg0, (StringBuilder[])arg1);
            sprozo2.cfr_renamed_17376((sprvrx<sprnyja>)arg0, n2, (String)arg5, (String)arg6);
            v0[0] = v0[0] + arg4;
            return;
        }
        arg1[0].append((char)arg3);
    }

    private /* synthetic */ boolean cfr_renamed_17407() {
        char[] cArray = new char[1];
        cArray[0] = 32;
        if (sprraia.cfr_renamed_15325(this.cfr_renamed_102, cArray).startsWith("```")) {
            String string;
            sprozo sprozo2 = this;
            char[] cArray2 = new char[1];
            cArray2[0] = 32;
            String string2 = sprraia.cfr_renamed_15325(sprozo2.cfr_renamed_102, cArray2);
            if (string2.indexOf(96, (string = sprozo2.cfr_renamed_17391(string2, '`')).length()) == -1) {
                return true;
            }
        } else {
            char[] cArray3 = new char[1];
            cArray3[0] = 32;
            if (sprraia.cfr_renamed_15325(this.cfr_renamed_102, cArray3).startsWith("~~~")) {
                return true;
            }
        }
        return false;
    }

    private /* synthetic */ boolean cfr_renamed_17396(String arg0) {
        if (!sprraia.cfr_renamed_12280(arg0)) {
            return (arg0 = sprraia.cfr_renamed_12806(arg0)).startsWith(Character.toString('|')) && arg0.endsWith(Character.toString('|'));
        }
        return false;
    }

    @sprtea
    public void cfr_renamed_17408(spridja arg0, sprcso arg1) {
        sprozo sprozo2 = this;
        this.cfr_renamed_91 = arg1;
        sprozo sprozo3 = this;
        this.cfr_renamed_3 = new sprcxo();
        String string = arg0.cfr_renamed_12403();
        string = string.replace("\r\n", "\n");
        string = string.replace("\r", "\n");
        sprozo2.cfr_renamed_4 = sprraia.cfr_renamed_13378(string, "\n".toCharArray());
        sprozo2.cfr_renamed_152 = this.cfr_renamed_4.length;
        while (this.cfr_renamed_17383()) {
            if (!this.cfr_renamed_1) {
                this.cfr_renamed_8520();
            }
            if (sprraia.cfr_renamed_12280(this.cfr_renamed_102)) continue;
            sprozo sprozo4 = this;
            sprozo4.cfr_renamed_1 = false;
            String string2 = sprraia.cfr_renamed_11765(sprozo4.cfr_renamed_102, "\r".toCharArray());
            sprppo sprppo2 = null;
            if (!sprozo4.cfr_renamed_17409() && this.cfr_renamed_17385()) {
                this.cfr_renamed_17402();
                continue;
            }
            if (this.cfr_renamed_17410()) {
                this.cfr_renamed_3.cfr_renamed_17365();
                continue;
            }
            if (this.cfr_renamed_17407()) {
                this.cfr_renamed_17411();
                continue;
            }
            sprppo[] sprppoArray = new sprppo[1];
            sprppoArray[0] = sprppo2;
            sprppo[] sprppoArray2 = sprppoArray;
            boolean bl = this.cfr_renamed_17398(string2, sprppoArray2);
            sprppo2 = sprppoArray2[0];
            sprozo sprozo5 = this;
            if (bl) {
                sprozo5.cfr_renamed_17394(string2, sprppo2);
                continue;
            }
            sprozo5.cfr_renamed_17389();
        }
        this.cfr_renamed_2637();
    }

    @sprtea
    public String cfr_renamed_17386() {
        return this.cfr_renamed_0;
    }

    public sprsso cfr_renamed_17412() {
        if (this.cfr_renamed_119.size() > 0) {
            return (sprsso)this.cfr_renamed_119.cfr_renamed_12398();
        }
        return new sprsso();
    }

    @sprtea
    public String cfr_renamed_17391(String arg0, char arg1) {
        char c;
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.length() && (c = arg0.charAt(n)) == arg1) {
            string = sprraia.cfr_renamed_17352(string, c);
            n2 = ++n;
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17413(sprvrx sprvrx2, String string, String string2) {
        String arg2;
        void arg1;
        void arg0;
        arg0.add(new sprnyja(sprueaa.cfr_renamed_9("@!n"), SaveToHtmlOption.cfr_renamed_9("<\u001b\u000e\u001d\u001b")));
        arg0.add(new sprnyja(sprueaa.cfr_renamed_9("H }\u0018l4}"), arg1));
        if (string2.startsWith(Character.toString('\"')) && arg2.endsWith(Character.toString('\"'))) {
            void v0 = arg2;
            arg2 = v0.substring(1, 1 + (v0.length() - 2));
        }
        arg0.add(new sprnyja(SaveToHtmlOption.cfr_renamed_9("<\u001d\f"), arg2));
        arg0.add(new sprnyja(sprueaa.cfr_renamed_9("@!n"), "End"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17400(sprsso sprsso2) {
        void arg0;
        void v0 = arg0;
        sprozo sprozo2 = this;
        void v2 = arg0;
        v2.cfr_renamed_17305(this.cfr_renamed_17412().cfr_renamed_15533());
        v2.cfr_renamed_17308(this.cfr_renamed_17412().cfr_renamed_15526());
        arg0.cfr_renamed_17303(sprozo2.cfr_renamed_17412().cfr_renamed_17309());
        v0.cfr_renamed_17306(sprozo2.cfr_renamed_17412().cfr_renamed_17307());
        v0.cfr_renamed_17311(this.cfr_renamed_17412().cfr_renamed_17312());
    }

    @sprtea
    public boolean cfr_renamed_17383() {
        if (this.cfr_renamed_4 != null) {
            sprozo sprozo2 = this;
            if (sprozo2.cfr_renamed_93 <= sprozo2.cfr_renamed_152 - 1) {
                return true;
            }
        }
        return false;
    }

    private /* synthetic */ String cfr_renamed_17414(sprtwo arg0) {
        return (arg0.cfr_renamed_17361() ? new StringBuilder().insert(0, this.cfr_renamed_86).append('.').toString() : this.cfr_renamed_86) + ' ';
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_17415(String arg0) {
        sprozo sprozo2;
        sprsso sprsso2 = this.cfr_renamed_119.size() > 0 ? spresca.cfr_renamed_11777(this.cfr_renamed_119.cfr_renamed_12398(), sprsso.class).cfr_renamed_12099() : new sprsso();
        switch (cfr_renamed_132.cfr_renamed_12854(arg0)) {
            case 8: {
                sprsso2.cfr_renamed_17305(true);
                sprozo2 = this;
                break;
            }
            case 9: {
                sprsso2.cfr_renamed_17308(true);
                sprozo2 = this;
                break;
            }
            case 10: {
                sprsso2.cfr_renamed_17306(true);
                sprozo2 = this;
                break;
            }
            case 11: {
                sprsso2.cfr_renamed_17311(1);
                sprozo2 = this;
                break;
            }
            case 12: {
                sprsso2.cfr_renamed_17311(2);
                sprozo2 = this;
                break;
            }
            case 13: {
                sprsso2.cfr_renamed_17303(true);
                sprozo2 = this;
                break;
            }
            case 14: {
                sprsso2.cfr_renamed_17304(true);
            }
            default: {
                sprozo2 = this;
            }
        }
        sprozo2.cfr_renamed_119.cfr_renamed_12516(sprsso2);
    }

    private /* synthetic */ String cfr_renamed_17401(String arg0) {
        int n;
        char[] cArray = new char[12];
        cArray[0] = 35;
        cArray[1] = 45;
        cArray[2] = 42;
        cArray[3] = 96;
        cArray[4] = 126;
        cArray[5] = 61;
        cArray[6] = 43;
        cArray[7] = 62;
        cArray[8] = 60;
        cArray[9] = 38;
        cArray[10] = 91;
        cArray[11] = 92;
        char[] cArray2 = cArray;
        int n2 = cArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            char c = cArray2[n];
            if (arg0.contains('\\' + Character.toString(c))) {
                arg0 = arg0.replace('\\' + Character.toString(c), Character.toString(c));
            }
            n3 = ++n;
        }
        return arg0;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_17395(sprhqo arg0, sprrqo arg1, boolean arg2) {
        v0 = var4_4 = arg0.cfr_renamed_17332().size() - 1;
        while (v0 >= 0) {
            var5_5 = arg0.cfr_renamed_17332().cfr_renamed_12151(var4_4);
            if (!arg2) ** GOTO lbl11
            if (var5_5 instanceof sprxap) {
                spresca.cfr_renamed_11777(var5_5, sprxap.class).cfr_renamed_17302().cfr_renamed_17305(true);
                v1 = arg1;
            } else {
                if (var5_5 instanceof sprfxo) {
                    spresca.cfr_renamed_11777(var5_5, sprfxo.class).cfr_renamed_17302().cfr_renamed_17305(true);
                }
lbl11:
                // 4 sources

                v1 = arg1;
            }
            v1.cfr_renamed_13978().cfr_renamed_12929(0, var5_5);
            arg0.cfr_renamed_17332().cfr_renamed_12148(var4_4--);
            v0 = var4_4;
        }
    }

    private /* synthetic */ void cfr_renamed_17416(int[] arg0, String arg1, sprvrx arg2, StringBuilder[] arg3, char arg4, boolean arg5) {
        int n;
        String string = arg1.substring(arg0[0]);
        if (this.cfr_renamed_17417(string, n = 0)) {
            String string2 = "";
            String string3 = "";
            String string4 = "";
            int n2 = 0;
            String[] stringArray = new String[1];
            stringArray[0] = string2;
            String[] stringArray2 = stringArray;
            String[] stringArray3 = new String[1];
            stringArray3[0] = string3;
            String[] stringArray4 = stringArray3;
            String[] stringArray5 = new String[1];
            stringArray5[0] = string4;
            String[] stringArray6 = stringArray5;
            int[] nArray = new int[1];
            nArray[0] = n2;
            int[] nArray2 = nArray;
            boolean bl = this.cfr_renamed_17372(string, stringArray2, stringArray4, stringArray6, nArray2);
            string2 = stringArray2[0];
            string3 = stringArray4[0];
            string4 = stringArray6[0];
            n2 = nArray2[0];
            if (bl) {
                arg0[0] = arg0[0] + n2;
                this.cfr_renamed_17397(arg2, arg3);
                if (arg5) {
                    this.cfr_renamed_17413(arg2, string2, string3);
                    return;
                }
                this.cfr_renamed_17405(arg2, string2, string3, string4);
                return;
            }
        } else {
            arg3[0].append(arg4);
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public boolean cfr_renamed_17392(String string, String[] stringArray, boolean[] blArray, boolean bl) {
        void arg1;
        void arg3;
        sprtwo sprtwo2;
        void arg0;
        boolean bl2 = arg0.startsWith(Character.toString('-') + ' ') && !sprraia.cfr_renamed_13266((String)arg0, "- [x] ", (short)5) && !sprraia.cfr_renamed_13266((String)arg0, "- [ ] ", (short)5) || arg0.startsWith(new StringBuilder().insert(0, Character.toString('+')).append(' ').toString()) || arg0.startsWith(new StringBuilder().insert(0, Character.toString('*')).append(' ').toString());
        String string2 = this.cfr_renamed_17403((String)arg0);
        boolean bl3 = !sprraia.cfr_renamed_12280(string2) && arg0.startsWith(new StringBuilder().insert(0, string2).append('.').append(' ').toString());
        sprtwo sprtwo3 = sprtwo2 = this.cfr_renamed_17387() instanceof sprhqo && spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprhqo.class).cfr_renamed_17335() != null ? spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprhqo.class).cfr_renamed_17335() : null;
        if (sprtwo2 != null && (bl3 || bl2)) {
            sprozo sprozo2 = this;
            String string3 = sprozo2.cfr_renamed_17414(sprtwo2);
            String string4 = sprozo2.cfr_renamed_17391(sprozo2.cfr_renamed_102, ' ');
            if (string3.length() == string4.length()) {
                if (arg3 != false) {
                    return true;
                }
                if (this.cfr_renamed_112.cfr_renamed_11861() < 9) {
                    sprozo sprozo3 = this;
                    ++sprozo3.cfr_renamed_107;
                    if (!sprozo3.cfr_renamed_112.cfr_renamed_14000(string4.length())) {
                        this.cfr_renamed_112.cfr_renamed_825(string4.length(), this.cfr_renamed_107);
                    }
                }
                arg1[0] = bl3 ? "1" : Character.toString('-');
                arg2[0] = bl3;
                this.cfr_renamed_86 = new StringBuilder().insert(0, string4).append((String)arg1[0]).toString();
                return true;
            }
            if (sprraia.cfr_renamed_12280(string4) || string4.length() < string3.length()) {
                sprozo sprozo4;
                if (arg3 != false) {
                    return true;
                }
                sprozo sprozo5 = this;
                if (this.cfr_renamed_112.cfr_renamed_14000(string4.length())) {
                    sprozo5.cfr_renamed_107 = this.cfr_renamed_112.cfr_renamed_576(string4.length());
                    sprozo4 = this;
                } else {
                    sprozo5.cfr_renamed_107 = 0;
                    sprozo4 = this;
                }
                if (sprraia.cfr_renamed_12280(sprozo4.cfr_renamed_2)) {
                    this.cfr_renamed_2 = string2;
                }
                String string5 = bl3 ? (this.cfr_renamed_107 > 0 ? "1" : this.cfr_renamed_2) : (arg1[0] = Character.toString('-'));
                if (this.cfr_renamed_107 == 0) {
                    sprozo sprozo6 = this;
                    sprozo6.cfr_renamed_112.cfr_renamed_722();
                    sprozo6.cfr_renamed_112.cfr_renamed_825(0, 0);
                }
                arg2[0] = bl3;
                this.cfr_renamed_86 = new StringBuilder().insert(0, string4).append(bl3 ? string2 : Character.toString('-')).toString();
                return true;
            }
        } else if (!this.cfr_renamed_102.startsWith("    ") && (bl3 || bl2)) {
            if (arg3 != false) {
                return true;
            }
            this.cfr_renamed_112.cfr_renamed_722();
            this.cfr_renamed_107 = 0;
            arg1[0] = bl3 ? string2 : Character.toString('-');
            this.cfr_renamed_112.cfr_renamed_825(0, 0);
            if (bl3) {
                this.cfr_renamed_2 = arg1[0];
            }
            arg2[0] = bl3;
            this.cfr_renamed_86 = arg1[0];
            return true;
        }
        return false;
    }

    private /* synthetic */ boolean cfr_renamed_17417(String arg0, int arg1) {
        int n;
        int n2 = arg1 < arg0.length() ? arg0.indexOf(93, arg1) : -1;
        int n3 = n2 > arg1 ? arg0.indexOf(40, n2) : -1;
        int n4 = n = n3 > n2 ? arg0.indexOf(41, n3) : -1;
        return n > -1;
    }

    public sprozo() {
        sprozo sprozo2 = this;
        sprozo sprozo3 = this;
        sprozo sprozo4 = this;
        sprozo sprozo5 = this;
        sprozo sprozo6 = this;
        sprozo6.cfr_renamed_93 = -1;
        sprozo6.cfr_renamed_4 = null;
        sprozo5.cfr_renamed_0 = "";
        sprozo5.cfr_renamed_102 = "";
        sprozo4.cfr_renamed_152 = 0;
        sprozo4.cfr_renamed_1 = false;
        sprozo sprozo7 = this;
        sprozo4.cfr_renamed_112 = new sprzsp();
        sprozo3.cfr_renamed_107 = 0;
        sprozo3.cfr_renamed_2 = "";
        sprozo2.cfr_renamed_86 = "";
        sprozo2.cfr_renamed_119 = null;
    }

    private /* synthetic */ void cfr_renamed_17393(String arg0, sprhqo arg1) {
        sprvrx<sprnyja> sprvrx2 = new sprvrx<sprnyja>();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        char c = '\u0000';
        int n2 = n;
        while (n2 < arg0.length()) {
            block20: {
                Object[] objectArray;
                char c2;
                block21: {
                    sprvrx<sprnyja> sprvrx3;
                    int n3;
                    String string;
                    block25: {
                        block24: {
                            block22: {
                                block23: {
                                    int n4;
                                    block19: {
                                        char c3 = c;
                                        c = arg0.charAt(n);
                                        char c4 = c2 = n < arg0.length() - 1 ? arg0.charAt(n + 1) : (char)'\u0000';
                                        if (c3 == '\u0000' || c3 != '\\') break block19;
                                        stringBuilder.append(c);
                                        break block20;
                                    }
                                    if (c != '*' && c != '~' && c != '`') break block21;
                                    string = Character.toString(c);
                                    if (c2 == '\u0000' || !"**".equals(c + Character.toString(c2))) break block22;
                                    if (sprvrx2.size() <= 1) break block23;
                                    n3 = sprvrx2.indexOf(new sprnyja("**", SaveToHtmlOption.cfr_renamed_9(" \u001f\n\u0001\n\u001d")));
                                    int n5 = n4 = n3 > -1 ? sprvrx2.indexOf(new sprnyja(Character.toString('*'), sprueaa.cfr_renamed_9("\u0003y)g){"))) : -1;
                                    if (n3 == -1 || n4 == -1 || n4 != n3 + 1) {
                                        ++n;
                                        string = "**";
                                    }
                                    break block24;
                                }
                                ++n;
                                string = "**";
                                sprvrx3 = sprvrx2;
                                break block25;
                            }
                            if (c2 != '\u0000' && "~~".equals(c + Character.toString(c2))) {
                                ++n;
                                string = "~~";
                            }
                        }
                        sprvrx3 = sprvrx2;
                    }
                    n3 = sprvrx3.indexOf(new sprnyja(string, SaveToHtmlOption.cfr_renamed_9(" \u001f\n\u0001\n\u001d")));
                    if (n3 > -1) {
                        StringBuilder[] stringBuilderArray = new StringBuilder[1];
                        stringBuilderArray[0] = stringBuilder;
                        objectArray = stringBuilderArray;
                        sprozo sprozo2 = this;
                        sprozo2.cfr_renamed_17397(sprvrx2, (StringBuilder[])objectArray);
                        stringBuilder = stringBuilderArray[0];
                        String string2 = string;
                        sprozo2.cfr_renamed_17376(sprvrx2, n3, string2, string2);
                    } else {
                        StringBuilder[] stringBuilderArray = new StringBuilder[1];
                        stringBuilderArray[0] = stringBuilder;
                        objectArray = stringBuilderArray;
                        this.cfr_renamed_17397(sprvrx2, (StringBuilder[])objectArray);
                        stringBuilder = stringBuilderArray[0];
                        sprvrx2.add(new sprnyja(string, sprueaa.cfr_renamed_9("\u0003y)g){")));
                    }
                    break block20;
                }
                if (c == '[') {
                    int[] nArray = new int[1];
                    nArray[0] = n;
                    int[] nArray2 = nArray;
                    StringBuilder[] stringBuilderArray = new StringBuilder[1];
                    stringBuilderArray[0] = stringBuilder;
                    StringBuilder[] stringBuilderArray2 = stringBuilderArray;
                    this.cfr_renamed_17416(nArray2, arg0, sprvrx2, stringBuilderArray2, c, false);
                    n = nArray2[0];
                    stringBuilder = stringBuilderArray[0];
                } else if (c == '!' && c2 == '[') {
                    int[] nArray = new int[1];
                    nArray[0] = n;
                    int[] nArray3 = nArray;
                    StringBuilder[] stringBuilderArray = new StringBuilder[1];
                    stringBuilderArray[0] = stringBuilder;
                    StringBuilder[] stringBuilderArray3 = stringBuilderArray;
                    this.cfr_renamed_17416(nArray3, arg0, sprvrx2, stringBuilderArray3, c, true);
                    n = nArray3[0];
                    stringBuilder = stringBuilderArray[0];
                } else if (c == '<') {
                    int n6 = 0;
                    String string = "";
                    int[] nArray = new int[1];
                    nArray[0] = n6;
                    objectArray = nArray;
                    String[] stringArray = new String[1];
                    stringArray[0] = string;
                    String[] stringArray2 = stringArray;
                    boolean bl = this.cfr_renamed_17373(arg0.substring(n), 0, (int[])objectArray, '<', '>', stringArray2);
                    n6 = objectArray[0];
                    string = stringArray[0];
                    if (bl) {
                        int[] nArray4;
                        StringBuilder[] stringBuilderArray;
                        if (SaveToHtmlOption.cfr_renamed_9("\u001c\u001a\r").equals(string) || sprueaa.cfr_renamed_9("z9y").equals(string)) {
                            StringBuilder[] stringBuilderArray4 = new StringBuilder[1];
                            stringBuilderArray4[0] = stringBuilder;
                            stringBuilderArray = stringBuilderArray4;
                            this.cfr_renamed_17397(sprvrx2, stringBuilderArray);
                            stringBuilder = stringBuilderArray4[0];
                            sprvrx2.add(new sprnyja(new StringBuilder().insert(0, "<").append(string).append(">").toString(), SaveToHtmlOption.cfr_renamed_9(" \u001f\n\u0001\n\u001d")));
                            n += n6;
                        } else if (sprueaa.cfr_renamed_9("cz9k").equals(string)) {
                            StringBuilder[] stringBuilderArray5 = new StringBuilder[1];
                            stringBuilderArray5[0] = stringBuilder;
                            stringBuilderArray = stringBuilderArray5;
                            int[] nArray5 = new int[1];
                            nArray5[0] = n;
                            nArray4 = nArray5;
                            this.cfr_renamed_17406(sprvrx2, stringBuilderArray, nArray4, c, n6, "<sub>", "</sub>");
                            stringBuilder = stringBuilderArray[0];
                            n = nArray4[0];
                        } else if (SaveToHtmlOption.cfr_renamed_9("@\u001c\u001a\u001f").equals(string)) {
                            StringBuilder[] stringBuilderArray6 = new StringBuilder[1];
                            stringBuilderArray6[0] = stringBuilder;
                            stringBuilderArray = stringBuilderArray6;
                            int[] nArray6 = new int[1];
                            nArray6[0] = n;
                            nArray4 = nArray6;
                            this.cfr_renamed_17406(sprvrx2, stringBuilderArray, nArray4, c, n6, "<sup>", "</sup>");
                            stringBuilder = stringBuilderArray[0];
                            n = nArray4[0];
                        } else {
                            stringBuilder.append(c);
                        }
                    } else {
                        stringBuilder.append(c);
                    }
                } else {
                    stringBuilder.append(c);
                }
            }
            n2 = ++n;
        }
        StringBuilder[] stringBuilderArray = new StringBuilder[1];
        stringBuilderArray[0] = stringBuilder;
        StringBuilder[] stringBuilderArray7 = stringBuilderArray;
        sprozo sprozo3 = this;
        sprozo3.cfr_renamed_17397(sprvrx2, stringBuilderArray7);
        stringBuilder = stringBuilderArray[0];
        sprozo3.cfr_renamed_17388(sprvrx2, arg1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ String[] cfr_renamed_17374(String string, char c) {
        void arg1;
        String arg0;
        if (arg0.contains("\\" + (char)arg1)) {
            int n;
            char[] cArray = arg0.toCharArray();
            sprvrx<Integer> sprvrx2 = new sprvrx<Integer>();
            int n2 = n = 0;
            while (n2 < cArray.length) {
                if (n > 0 && cArray[n] == arg1 && cArray[n - 1] != '\\') {
                    sprvrx2.add(n);
                } else if (n == 0 && cArray[n] == arg1) {
                    sprvrx2.add(n);
                }
                n2 = ++n;
            }
            n = 1;
            String[] stringArray = new String[sprvrx2.size() - 1];
            int n3 = 0;
            Iterator iterator = sprvrx2.iterator();
            while (iterator.hasNext()) {
                int n4 = (Integer)iterator.next();
                if (n4 <= 0) continue;
                int n5 = n4 - n;
                int n6 = n;
                stringArray[n3] = arg0.substring(n6, n6 + n5);
                ++n3;
                n = n4 + 1;
            }
            return stringArray;
        }
        if (arg0.charAt(0) == arg1) {
            void v2 = arg0;
            if (v2.charAt(v2.length() - 1) == arg1) {
                void v3 = arg0;
                arg0 = v3.substring(1, 1 + (v3.length() - 2));
            }
        }
        return sprraia.cfr_renamed_434(arg0, (char)arg1);
    }

    @sprtea
    public void cfr_renamed_17411() {
        char[] cArray = new char[1];
        cArray[0] = 32;
        char c = sprraia.cfr_renamed_15325(this.cfr_renamed_102, cArray).startsWith("```") ? (char)'`' : '~';
        sprozo sprozo2 = this;
        char[] cArray2 = new char[1];
        cArray2[0] = 32;
        String string = sprozo2.cfr_renamed_17391(sprraia.cfr_renamed_15325(sprozo2.cfr_renamed_102, cArray2), c);
        sprjap sprjap2 = spresca.cfr_renamed_11777(sprozo2.cfr_renamed_3.cfr_renamed_17366(), sprjap.class);
        sprozo sprozo3 = this;
        sprozo sprozo4 = sprozo3;
        sprozo3.cfr_renamed_8520();
        while (sprozo4.cfr_renamed_102 != null) {
            block4: {
                block3: {
                    char[] cArray3 = new char[1];
                    cArray3[0] = 32;
                    if (sprraia.cfr_renamed_11730(sprraia.cfr_renamed_15325(this.cfr_renamed_102, cArray3), string)) break block3;
                    char[] cArray4 = new char[1];
                    cArray4[0] = 32;
                    if (!sprraia.cfr_renamed_15325(this.cfr_renamed_102, cArray4).startsWith(string)) break block4;
                    sprozo sprozo5 = this;
                    if (!sprozo5.cfr_renamed_17404(sprozo5.cfr_renamed_102, c)) break block4;
                }
                if (!this.cfr_renamed_102.startsWith("    ")) break;
            }
            sprjap2.cfr_renamed_17102().add(this.cfr_renamed_102);
            this.cfr_renamed_8520();
            sprozo4 = this;
        }
    }

    @sprtea
    public sprjt cfr_renamed_17387() {
        if (this.cfr_renamed_3 != null && this.cfr_renamed_3.cfr_renamed_17346() != null && this.cfr_renamed_3.cfr_renamed_17346().size() > 0) {
            return this.cfr_renamed_3.cfr_renamed_17346().cfr_renamed_12151(this.cfr_renamed_3.cfr_renamed_17346().size() - 1);
        }
        return null;
    }

    private /* synthetic */ boolean cfr_renamed_17390() {
        return sprraia.cfr_renamed_12806(this.cfr_renamed_102).startsWith("<!--") && sprraia.cfr_renamed_12806(this.cfr_renamed_102).endsWith("-->");
    }

    @sprtea
    public boolean cfr_renamed_17409() {
        if (!sprraia.cfr_renamed_12280(this.cfr_renamed_102) && this.cfr_renamed_102.startsWith("    ") && sprraia.cfr_renamed_12280(this.cfr_renamed_17386()) && this.cfr_renamed_17387() instanceof sprhqo && spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprhqo.class).cfr_renamed_17335() != null) {
            String string = "";
            boolean bl = false;
            String[] stringArray = new String[1];
            stringArray[0] = string;
            String[] stringArray2 = stringArray;
            boolean[] blArray = new boolean[1];
            blArray[0] = bl;
            boolean[] blArray2 = blArray;
            sprozo sprozo2 = this;
            char[] cArray = new char[1];
            cArray[0] = 32;
            boolean bl2 = sprozo2.cfr_renamed_17392(sprraia.cfr_renamed_15325(sprozo2.cfr_renamed_102, cArray), stringArray2, blArray2, true);
            string = stringArray2[0];
            bl = blArray2[0];
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    @sprtea
    public boolean cfr_renamed_17410() {
        String string;
        if ((sprraia.cfr_renamed_12280(this.cfr_renamed_0) || this.cfr_renamed_17387() instanceof sprhqo && spresca.cfr_renamed_11777(this.cfr_renamed_17387(), sprhqo.class).cfr_renamed_17335() != null || this.cfr_renamed_93 == 0) && !sprraia.cfr_renamed_12280(string = this.cfr_renamed_102.replace(Character.toString(' '), "")) && string.startsWith("---")) {
            return sprraia.cfr_renamed_12280(string.replace(Character.toString('-'), ""));
        }
        return false;
    }
}

