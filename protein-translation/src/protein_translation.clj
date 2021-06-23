(ns protein-translation)

(defn translate-codon [] ;; <- arglist goes here
      ;; your code goes here
)

(defn translate-rna [] ;; <- arglist goes here
  ;; your code goes here
  )
(def codon->protein
  {:AUG	"Methionine"
   :UUU	"Phenylalanine"
   :UUC	"Phenylalanine"
   :UUA "Leucine"
   :UUG	"Leucine"
   :UCU "Serine"
   :UCC "Serine"
   :UCA "Serine"
   :UCG "Serine"
   :UAU  "Tyrosine"
   :UAC  "Tyrosine"
   :UGU  "Cysteine"
   :UGC  "Cysteine"
   :UGG  "Tryptophan"
   :UAA  "STOP"
   :UAG  "STOP"
   :UGA  "STOP"})

;; - split sequence into 3 string codons
;; - translate 3 string codons to specific polypeptides
;; - 3 codons are stop codons and terminate translation

(map str (partition-all 3 "AUGUUUUCU"))
