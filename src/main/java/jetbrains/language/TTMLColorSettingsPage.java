package jetbrains.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class TTMLColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Normal", TTMLSyntaxHighlighter.NORMAL),
            new AttributesDescriptor("Bold", TTMLSyntaxHighlighter.BOLD),
            new AttributesDescriptor("Italic", TTMLSyntaxHighlighter.ITALIC),
            new AttributesDescriptor("Underlined", TTMLSyntaxHighlighter.UNDERLINED),
            new AttributesDescriptor("Strikethrough", TTMLSyntaxHighlighter.STRIKETHROUGH),
            new AttributesDescriptor("Other", TTMLSyntaxHighlighter.OTHER),
            new AttributesDescriptor("Text", TTMLSyntaxHighlighter.TEXT),
    };

    @Override
    public @Nullable Icon getIcon() {
        return TTMLIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new TTMLSyntaxHighlighter();
    }

    @Override
    public @NonNls
    @NotNull String getDemoText() {
        return "^F^W^V^ATTML: TeleType Markup Language^M\n" +
                "\n" +
                "^B^ATTML^B is a simple markup language that can be used for all kinds of documents.^M\n" +
                "the appearance of ^ATTML^B text is meant to evoke the look of mathematical and^M\n" +
                "scientific papers of the mid 20th century. ^ATTML^B uses simple ^Edirectives^B^M\n" +
                "which alter the appearance of text, reposition the flow of text, or allow stylistic^M\n" +
                "beauty within a minimalistic and retro aesthetic.^M\n" +
                "TTML directives consist of ascii control codes, or, for easier typing, the^M\n" +
                "caret-notation for those codes. Note the ^^^^ directive is used to insert a caret^M\n" +
                "into a TTML document.^M\n" +
                "Note that this documentation is best read by following its TTML source and rendered^M\n" +
                "version in parallel.^M";
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "TTML";
    }
}
