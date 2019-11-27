package main

import (
	"testing"
)

func TestPalindrome(t *testing.T) {
	if !IsPalindrome("restart") {
		t.Error(`IsPalindrome("restart") = false`)
	}
	if !IsPalindrome("kayak") {
		t.Error(`IsPalindrome("kayak") = false`)
	}
}

func TestNonPalindrom(t *testing.T) {
	if IsPalindrome("palindrome") {
		t.Error(`IsPalindrome("palindrome) = true"`)
	}
}

func TestIsPalindrome(t *testing.T) {
	var tests = []struct {
		input string
		want  bool
	}{
		{"", true},
		{"a", true},
		{"ab", false},
		{"aba", true},
	}

	got := IsPalindrome(tests[0].input)
	if got != tests[0].want {
		t.Errorf("IsPalindrome(%q) = %v", tests[0].input, got)
	}
}
