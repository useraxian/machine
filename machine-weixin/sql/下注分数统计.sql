SELECT
	t.record_id record_id,
	t.fruit_id fruit_id,
	f.cn_name fruit_name,
	SUM(sum_score) sum_score,
	SUM(sum_score) * f.fruit_multiple all_sum
FROM
	(
		SELECT
			record_id,
			bet_fruit_id_1 fruit_id,
			sum(bet_score_1) sum_score
		FROM
			t_machine_bet_record r
		GROUP BY
			record_id,
			fruit_id
		UNION ALL
			SELECT
				record_id,
				bet_fruit_id_2 fruit_id,
				sum(bet_score_2) sum_score
			FROM
				t_machine_bet_record r
			GROUP BY
				record_id,
				fruit_id
			UNION ALL
				SELECT
					record_id,
					bet_fruit_id_3 fruit_id,
					sum(bet_score_3) sum_score
				FROM
					t_machine_bet_record r
				GROUP BY
					record_id,
					fruit_id
				UNION ALL
					SELECT
						record_id,
						bet_fruit_id_4 fruit_id,
						sum(bet_score_4) sum_score
					FROM
						t_machine_bet_record r
					GROUP BY
						record_id,
						fruit_id
					UNION ALL
						SELECT
							record_id,
							bet_fruit_id_5 fruit_id,
							sum(bet_score_5) sum_score
						FROM
							t_machine_bet_record r
						GROUP BY
							record_id,
							fruit_id
						UNION ALL
							SELECT
								record_id,
								bet_fruit_id_6 fruit_id,
								sum(bet_score_6) sum_score
							FROM
								t_machine_bet_record r
							GROUP BY
								record_id,
								fruit_id
							UNION ALL
								SELECT
									record_id,
									bet_fruit_id_7 fruit_id,
									sum(bet_score_7) sum_score
								FROM
									t_machine_bet_record r
								GROUP BY
									record_id,
									fruit_id
	) t
LEFT JOIN t_machine_fruit f ON f.id = t.fruit_id
GROUP BY
	t.record_id,
	t.fruit_id