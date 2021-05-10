// This is a generated file. Not intended for manual editing.
package jetbrains.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static jetbrains.language.psi.TTMLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TTMLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return start_rule(b, l + 1);
  }

  /* ********************************************************** */
  // (line '\n')*
  public static boolean content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONTENT, "<content>");
    while (true) {
      int c = current_position_(b);
      if (!content_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "content", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // line '\n'
  private static boolean content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "content_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = line(b, l + 1);
    r = r && consumeToken(b, "\\n");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (markup | TEXT)*
  public static boolean line(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line")) return false;
    Marker m = enter_section_(b, l, _NONE_, LINE, "<line>");
    while (true) {
      int c = current_position_(b);
      if (!line_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "line", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // markup | TEXT
  private static boolean line_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_0")) return false;
    boolean r;
    r = markup(b, l + 1);
    if (!r) r = consumeToken(b, TEXT);
    return r;
  }

  /* ********************************************************** */
  // NORMAL | BOLD | ITALIC | UNDERLINED | STRIKETHROUGH | OTHER
  public static boolean markup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "markup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MARKUP, "<markup>");
    r = consumeToken(b, NORMAL);
    if (!r) r = consumeToken(b, BOLD);
    if (!r) r = consumeToken(b, ITALIC);
    if (!r) r = consumeToken(b, UNDERLINED);
    if (!r) r = consumeToken(b, STRIKETHROUGH);
    if (!r) r = consumeToken(b, OTHER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // content <<eof>>
  static boolean start_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "start_rule")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = content(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
