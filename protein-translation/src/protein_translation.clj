(ns protein-translation)

(def codon->protein
  {:AUG "Methionine"
   :UUU "Phenylalanine"
   :UUC "Phenylalanine"
   :UUA "Leucine"
   :UUG "Leucine"
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

(defn translate-codon [codon]
  ((keyword codon) codon->protein))

(defn translate-rna [rna]
  (let [tran (map keyword (map (fn [char-seq] (apply str char-seq)) (partition-all 3 rna)))]
    (for [x tran
          :while (not= x :UAA)
          :while (not= x :UAG)
          :while (not= x :UGA)]
      (x codon->protein))))

;; - split sequence into 3 string codons
;; - translate 3 string codons to specific polypeptides
;; - 3 codons are stop codons and terminate translation
;; - output '("AUG" "UUU")

(apply str (seq "AUGUUUUCU"))

(partition-all 3 "AUGUUUUCU")

;; - using a mapper to apply str to each partitioned 'char-seq' in the list
;; - can also use hash syntax but the naming makes it more clear what is going on
(map keyword (map (fn [char-seq] (apply str char-seq)) (partition-all 3 "AUGUUUUCU")))

(for [x [:AUG :UUU :UCU]]
  (x codon->protein))
