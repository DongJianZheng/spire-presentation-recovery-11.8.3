package com.spire.presentation;

import recovery.build.EnumBase;
import com.spire.presentation.packages.sprfto;
import com.spire.presentation.packages.sprrrd;

/** JVM enum reconstructed with explicit name initialization; see tools/member-name-map.json. */
public final class FileFormat extends EnumBase<FileFormat> {
    public static final FileFormat TIFF;
    public static final FileFormat DPS;
    public static final FileFormat WMV;
    public static final FileFormat PPSX_2013;
    public static final FileFormat PPS;
    public static final FileFormat MP4;
    public static final FileFormat PDF;
    public static final FileFormat PPTX_2010;
    public static final FileFormat Markdown;
    public static final FileFormat PPTX_2016;
    public static final FileFormat POTX;
    public static final FileFormat PPT;
    private static final FileFormat[] allValues;
    public static final FileFormat PPSX_2007;
    public static final FileFormat DPT;
    public static final FileFormat PPTX_2013;
    public static final FileFormat OFD;
    private String displayName;
    public static final FileFormat PPSX_2016;
    public static final FileFormat PPTX_2007;
    public static final FileFormat SVG;
    public static final FileFormat PPSX_2019;
    public static final FileFormat ODP;
    private int value;
    public static final FileFormat PPTX_2019;
    public static final FileFormat PPSX_2010;
    public static final FileFormat AUTO;
    public static final FileFormat XPS;
    public static final FileFormat PPTM;
    public static final FileFormat HTML;

    static {
        AUTO = new FileFormat(sprfto.cfr_renamed_9("E\u0004P\u001e"), 0, sprrrd.cfr_renamed_9("\u0002?7%"), 0);
        PPT = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0005"), 1, sprrrd.cfr_renamed_9("\u001a\u0013\u001e"), 1);
        PPTX_2007 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0005\\\u000e6a4f"), 2, sprrrd.cfr_renamed_9("\u001a3>;\u0015qzs}"), 2);
        PPTX_2010 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0005\\\u000e6a5a"), 3, sprrrd.cfr_renamed_9("\u001a3>;\u0015qzrz"), 3);
        PPTX_2013 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0005\\\u000e6a5b"), 4, sprrrd.cfr_renamed_9("\u001a3>;\u0015qzry"), 4);
        PPSX_2007 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0002\\\u000e6a4f"), 5, sprrrd.cfr_renamed_9("\u001a39;\u0015qzs}"), 5);
        PPSX_2010 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0002\\\u000e6a5a"), 6, sprrrd.cfr_renamed_9("\u001a39;\u0015qzrz"), 6);
        PPSX_2013 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0002\\\u000e6a5b"), 7, sprrrd.cfr_renamed_9("\u001a39;\u0015qzry"), 7);
        PPS = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0002"), 8, sprrrd.cfr_renamed_9("\u001a\u0013\u0019"), 8);
        ODP = new FileFormat(sprfto.cfr_renamed_9("\u001e@\u0001"), 9, sprrrd.cfr_renamed_9("\u0005\u0007\u001a"), 9);
        HTML = new FileFormat(sprfto.cfr_renamed_9("L\u0005I\u001d"), 10, sprrrd.cfr_renamed_9("\u000b>.&"), 10);
        TIFF = new FileFormat(sprfto.cfr_renamed_9("P\u0018B\u0017"), 11, sprrrd.cfr_renamed_9("\u0017#%,"), 11);
        XPS = new FileFormat(sprfto.cfr_renamed_9("\tT\u0002"), 12, sprrrd.cfr_renamed_9("\u0012\u0013\u0019"), 12);
        PDF = new FileFormat(sprfto.cfr_renamed_9("\u0001@\u0017"), 13, sprrrd.cfr_renamed_9("\u001a\u0007\f"), 13);
        POTX = new FileFormat(sprfto.cfr_renamed_9("T\u001eP\t"), 14, sprrrd.cfr_renamed_9("\u0013\u0005\u0017\u0012"), 14);
        PPTX_2016 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0005\\\u000e6a5g"), 15, sprrrd.cfr_renamed_9("\u001a3>;\u0015qzr|"), 15);
        PPTX_2019 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0005\\\u000e6a5h"), 16, sprrrd.cfr_renamed_9("\u001a3>;\u0015qzrs"), 16);
        PPSX_2016 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0002\\\u000e6a5g"), 17, sprrrd.cfr_renamed_9("\u001a39;\u0015qzr|"), 17);
        DPS = new FileFormat(sprfto.cfr_renamed_9("\u0015T\u0002"), 18, sprrrd.cfr_renamed_9("\u000e\u0013\u0019"), 18);
        DPT = new FileFormat(sprfto.cfr_renamed_9("\u0015T\u0005"), 19, sprrrd.cfr_renamed_9("\u000e\u0013\u001e"), 19);
        OFD = new FileFormat("OFD", 20, "OFD", 20);
        PPTM = new FileFormat(sprfto.cfr_renamed_9("T\u0001P\u001c"), 21, sprrrd.cfr_renamed_9("\u0013\u001a\u0017\u0007"), 21);
        SVG = new FileFormat(sprfto.cfr_renamed_9("\u0002R\u0016"), 22, sprrrd.cfr_renamed_9("\u0019\u0015\r"), 22);
        PPSX_2019 = new FileFormat(sprfto.cfr_renamed_9("\u0001T\u0002\\\u000e6a5h"), 23, sprrrd.cfr_renamed_9("\u001a39;\u0015qzrs"), 23);
        Markdown = new FileFormat(sprfto.cfr_renamed_9("I0v:`>s?"), 24, sprrrd.cfr_renamed_9("\u000e+1!'%4$"), 24);
        MP4 = new FileFormat(sprfto.cfr_renamed_9("\u001cTe"), 25, sprrrd.cfr_renamed_9("'3~"), 25);
        WMV = new FileFormat(sprfto.cfr_renamed_9("\u0006I\u0007"), 26, sprrrd.cfr_renamed_9("=.<"), 26);
        allValues = new FileFormat[]{AUTO, PPT, PPTX_2007, PPTX_2010, PPTX_2013, PPSX_2007, PPSX_2010, PPSX_2013, PPS, ODP, HTML, TIFF, XPS, PDF, POTX, PPTX_2016, PPTX_2019, PPSX_2016, DPS, DPT, OFD, PPTM, SVG, PPSX_2019, Markdown, MP4, WMV};
    }

    private FileFormat(String enumName, int ordinal, String displayName, int value) {
        super(enumName, ordinal);
        this.displayName = displayName;
        this.value = value;
    }

    public int getValue() { return this.value; }
    public String getName() { return this.displayName; }
    public static FileFormat[] values() { return allValues.clone(); }
    public static FileFormat valueOf(String name) { return EnumBase.valueOf(FileFormat.class, name); }
}
