bin = .
src = $(wildcard *.c)
dst = $(addprefix $(bin)/, $(basename $(src)))

build: $(bin) $(dst)
	@true

$(bin)/%: %.c
	gcc -o $@ $<

$(bin):
	mkdir -vp $(bin)

.PHONY: build